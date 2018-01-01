package com.min.entity;

import java.util.List;

public class GzuEntity
{
    private String school;

    private String student;

    private List<String> areas;

    public String getSchool()
    {
        return school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public String getStudent()
    {
        return student;
    }

    public void setStudent(String student)
    {
        this.student = student;
    }

    public List<String> getAreas()
    {
        return areas;
    }

    public void setAreas(List<String> areas)
    {
        this.areas = areas;
    }

    public void print()
    {
        System.out.println("ĞÕÃû£º"+student+",Ñ§Ğ££º"+school);
    }
}
