from django.shortcuts import render, redirect
from . import models
from . import forms

# Create your views here.


def home(request):
    if request.method == "POST":
        std_form = forms.StudentForm(request.POST)
        if std_form.is_valid():
            std_form.save()
            student_form = forms.StudentForm()
    else:
        student_form = forms.StudentForm()
    students = models.Student.objects.all()  # select * from students
    context = {"students": students, "student_form": student_form}
    return render(request, "home.html", context)


def edit_student(request, id):
    student = models.Student.objects.get(
        id=id
    )  # select * from students where id = value;
    if request.method == "POST":
        std_form = forms.StudentForm(request.POST, instance=student)
        if std_form.is_valid():
            std_form.save()
            return redirect("home")
    else:
        student_form = forms.StudentForm(instance=student)
    context = {"student_form": student_form}
    return render(request, "edit.html", context)


def delete_student(request, id):
    student = models.Student.objects.get(id=id)
    if student:
        student.delete()
        return redirect("home")
