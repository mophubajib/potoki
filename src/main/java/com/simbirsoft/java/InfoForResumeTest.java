package com.simbirsoft.java;

public class InfoForResumeTest {


    private String fio;
    private String dob;
    private String mobile;
    private String email;
    private String skype;
    private String avatar;
    private String target;
    private String experience;
    private String courses;
    private String education;
    private String skills;
    private String exemplecode;

//    PropsReaderImpl propsReader = new PropsReaderImpl();


    public InfoForResumeTest(

            String fio,
            String dob,
            String mobile,
            String email,
            String skype,
            String avatar,
            String target,
            String experience,
            String courses,
            String education,
            String skills,
            String exemplecode

    ) {
        this.fio = fio;
        this.dob = dob;
        this.mobile = mobile;
        this.email = email;
        this.skype = skype;
        this.avatar = avatar;
        this.target = target;
        this.experience = experience;
        this.courses = courses;
        this.education = education;
        this.skills = skills;
        this.exemplecode = exemplecode;

    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExemplecode() {
        return exemplecode;
    }

    public void setExemplecode(String exemplecode) {
        this.exemplecode = exemplecode;
    }
}

