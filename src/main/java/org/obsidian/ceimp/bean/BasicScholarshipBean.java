package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2018/5/16.
 */
public class BasicScholarshipBean {
    private Integer timeStart = 0;  //开始时间
    private Integer timeEnd = 0;    //结束时间
    private String school = "";      //院系，二级学院
    private String major = "";       //专业
    private String classNum = "";    //班级号，注意只有数字
    private String username = "";    //姓名
    private String sex = "";         //性别
    private String account = "";     //学号
    private String birth = "";       //出生年月
    private String entrance = "";    //入学时间
    private String phone = "";       //联系电话
    private String identity = "";    //身份证号
    private String nation = "";      //民族
    private String political = "";   //政治面貌
    private String job = "";         //职务
    private String charact = "";   //品德素质
    private String study = "";       //学业素质
    private String ability = "";     //发展能力素质
    private String total = "";       //总分
    private String ceRank = "";      //专业排名，这个是综测排名
    private String gpRank = "";      //成绩排名，这个是绩点排名
    private String majorSum = "";   //专业总人数
    private String resident = "";    //家庭户口
    private String incomeSource = "";//收入来源
    private String monthIncome = ""; //家庭月收入
    private String familySum = "";   //家庭人口总数
    private String address = "";     //家庭住址
    private String postalCode = "";  //邮政编码
    private String situation = "";   //认定情况
    private String classSum = "";    //必修课数
    private String passSum = "";     //必修课及格数
    private String fName1 = "";      //国家助学金家庭成员情况，姓名
    private String age1 = "";        //国家助学金家庭成员情况，年龄
    private String relation1 = "";   //国家助学金家庭成员情况，与本人关系
    private String workPlace1 = "";  //国家助学金家庭成员情况，工作或学习单位
    private String fName2 = "";
    private String age2 = "";
    private String relation2 = "";
    private String workPlace2 = "";
    private String fName3 = "";
    private String age3 = "";
    private String relation3 = "";
    private String workPlace3 = "";
    private String fName4 = "";
    private String age4 = "";
    private String relation4 = "";
    private String workPlace4 = "";
    private String fName5 = "";
    private String age5 = "";
    private String relation5 = "";
    private String workPlace5 = "";
    private String date1 = "";       //大学期间主要获奖情况，日期
    private String award1 = "";      //大学期间主要获奖情况，奖项名称
    private String unit1 = "";       //大学期间主要获奖情况，颁奖单位
    private String date2 = "";
    private String award2 = "";
    private String unit2 = "";
    private String date3 = "";
    private String award3 = "";
    private String unit3 = "";
    private String date4 = "";
    private String award4 = "";
    private String unit4 = "";
    private String applyReason = ""; //申请理由
    private String recommendReason = ""; //省政府奖学金，推荐理由
    private String rank = "";        //校奖学金，拟评奖学金等级
    private String opinion = "";     //院系意见

    public BasicScholarshipBean() {
    }

    public BasicScholarshipBean(Builder builder){
        this.timeStart = builder.timeStart;
        this.timeEnd = builder.timeEnd;
        this.school = builder.school;
        this.major = builder.major;
        this.classNum = builder.classNum;
        this.username = builder.username;
        this.sex = builder.sex;
        this.account = builder.account;
        this.birth = builder.birth;
        this.entrance = builder.entrance;
        this.phone = builder.phone;
        this.identity = builder.identity;
        this.nation = builder.nation;
        this.political = builder.political;
        this.job = builder.job;
        this.charact = builder.charact;
        this.study = builder.study;
        this.ability = builder.ability;
        this.total = builder.total;
        this.ceRank = builder.ceRank;
        this.gpRank = builder.gpRank;
        this.majorSum = builder.majorSum;
        this.resident = builder.resident;
        this.incomeSource = builder.incomeSource;
        this.monthIncome = builder.monthIncome;
        this.familySum = builder.familySum;
        this.address = builder.address;
        this.postalCode = builder.postalCode;
        this.situation = builder.situation;
        this.classSum = builder.classSum;
        this.passSum = builder.passSum;
        this.fName1 = builder.fName1;
        this.age1 = builder.age1;
        this.relation1 = builder.relation1;
        this.workPlace1 = builder.workPlace1;
        this.fName2 = builder.fName2;
        this.age2 = builder.age2;
        this.relation2 = builder.relation2;
        this.workPlace2 = builder.workPlace2;
        this.fName3 = builder.fName3;
        this.age3 = builder.age3;
        this.relation3 = builder.relation3;
        this.workPlace3 = builder.workPlace3;
        this.fName4 = builder.fName4;
        this.age4 = builder.age4;
        this.relation4 = builder.relation4;
        this.workPlace4 = builder.workPlace4;
        this.fName5 = builder.fName5;
        this.age5 = builder.age5;
        this.relation5 = builder.relation5;
        this.workPlace5 = builder.workPlace5;
        this.date1 = builder.date1;
        this.award1 = builder.award1;
        this.unit1 = builder.unit1;
        this.date2 = builder.date2;
        this.award2 = builder.award2;
        this.unit2 = builder.unit2;
        this.date3 = builder.date3;
        this.award3 = builder.award3;
        this.unit3 = builder.unit3;
        this.date4 = builder.date4;
        this.award4 = builder.award4;
        this.unit4 = builder.unit4;
        this.applyReason = builder.applyReason;
        this.recommendReason = builder.recommendReason;
        this.rank = builder.rank;
        this.opinion = builder.opinion;
    }

    public static class Builder{
        private Integer timeStart;
        private Integer timeEnd;
        private String school;
        private String major;
        private String classNum;
        private String username;
        private String sex;
        private String account;
        private String birth;
        private String entrance;
        private String phone;
        private String identity;
        private String nation;
        private String political;
        private String job;
        private String charact;
        private String study;
        private String ability;
        private String total;
        private String ceRank;
        private String gpRank;
        private String majorSum;
        private String resident;
        private String incomeSource;
        private String monthIncome;
        private String familySum;
        private String address;
        private String postalCode;
        private String situation;
        private String classSum;
        private String passSum;
        private String fName1;
        private String age1;
        private String relation1;
        private String workPlace1;
        private String fName2;
        private String age2;
        private String relation2;
        private String workPlace2;
        private String fName3;
        private String age3;
        private String relation3;
        private String workPlace3;
        private String fName4;
        private String age4;
        private String relation4;
        private String workPlace4;
        private String fName5;
        private String age5;
        private String relation5;
        private String workPlace5;
        private String date1;
        private String award1;
        private String unit1;
        private String date2;
        private String award2;
        private String unit2;
        private String date3;
        private String award3;
        private String unit3;
        private String date4;
        private String award4;
        private String unit4;
        private String applyReason;
        private String recommendReason;
        private String rank;
        private String opinion;

        public Builder timeStart(Integer timeStart){
            this.timeStart = timeStart;
            return this;
        }
        public Builder timeEnd(Integer timeEnd){
            this.timeEnd = timeEnd;
            return this;
        }
        public Builder school(String school){
            this.school = school;
            return this;
        }
        public Builder major(String major){
            this.major = major;
            return this;
        }
        public Builder classNum(String classNum){
            this.classNum = classNum;
            return this;
        }
        public Builder username(String username){
            this.username = username;
            return this;
        }
        public Builder sex(String sex){
            this.sex = sex;
            return this;
        }
        public Builder account(String account){
            this.account = account;
            return this;
        }
        public Builder birth(String birth){
            this.birth = birth;
            return this;
        }
        public Builder entrance(String entrance){
            this.entrance = entrance;
            return this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder identity(String identity){
            this.identity = identity;
            return this;
        }
        public Builder nation(String nation){
            this.nation = nation;
            return this;
        }
        public Builder political(String political){
            this.political = political;
            return this;
        }
        public Builder job(String job){
            this.job = job;
            return this;
        }
        public Builder charact(String charact){
            this.charact = charact;
            return this;
        }
        public Builder study(String study){
            this.study = study;
            return this;
        }
        public Builder ability(String ability){
            this.ability = ability;
            return this;
        }
        public Builder total(String total){
            this.total = total;
            return this;
        }
        public Builder ceRank(String ceRank){
            this.ceRank = ceRank;
            return this;
        }
        public Builder gpRank(String gpRank){
            this.gpRank = gpRank;
            return this;
        }
        public Builder majorSum(String majorSum){
            this.majorSum = majorSum;
            return this;
        }
        public Builder resident(String resident){
            this.resident = resident;
            return this;
        }
        public Builder incomeSource(String incomeSource){
            this.incomeSource = incomeSource;
            return this;
        }
        public Builder monthIncome(String monthIncome){
            this.monthIncome = monthIncome;
            return this;
        }
        public Builder familySum(String familySum){
            this.familySum = familySum;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder postalCode(String postalCode){
            this.postalCode = postalCode;
            return this;
        }
        public Builder situation(String situation){
            this.situation = situation;
            return this;
        }
        public Builder classSum(String classSum){
            this.classSum = classSum;
            return this;
        }
        public Builder passSum(String passSum){
            this.passSum = passSum;
            return this;
        }
        public Builder fName1(String fName1){
            this.fName1 = fName1;
            return this;
        }
        public Builder age1(String age1){
            this.age1 = age1;
            return this;
        }
        public Builder relation1(String relation1){
            this.relation1 = relation1;
            return this;
        }
        public Builder workPlace1(String workPlace1){
            this.workPlace1 = workPlace1;
            return this;
        }
        public Builder fName2(String fName2){
            this.fName2 = fName2;
            return this;
        }
        public Builder age2(String age2){
            this.age2 = age2;
            return this;
        }
        public Builder relation2(String relation2){
            this.relation2 = relation2;
            return this;
        }
        public Builder workPlace2(String workPlace2){
            this.workPlace2 = workPlace2;
            return this;
        }
        public Builder fName3(String fName3){
            this.fName3 = fName3;
            return this;
        }
        public Builder age3(String age3){
            this.age3 = age3;
            return this;
        }
        public Builder relation3(String relation3){
            this.relation3 = relation3;
            return this;
        }
        public Builder workPlace3(String workPlace3){
            this.workPlace3 = workPlace3;
            return this;
        }
        public Builder fName4(String fName4){
            this.fName4 = fName4;
            return this;
        }
        public Builder age4(String age4){
            this.age4 = age4;
            return this;
        }
        public Builder relation4(String relation4){
            this.relation4 = relation4;
            return this;
        }
        public Builder workPlace4(String workPlace4){
            this.workPlace4 = workPlace4;
            return this;
        }
        public Builder fName5(String fName5){
            this.fName5 = fName5;
            return this;
        }
        public Builder age5(String age5){
            this.age5 = age5;
            return this;
        }
        public Builder relation5(String relation5){
            this.relation5 = relation5;
            return this;
        }
        public Builder workPlace5(String workPlace5){
            this.workPlace5 = workPlace5;
            return this;
        }
        public Builder date1(String date1){
            this.date1 = date1;
            return this;
        }
        public Builder award1(String award1){
            this.award1 = award1;
            return this;
        }
        public Builder unit1(String unit1){
            this.unit1 = unit1;
            return this;
        }
        public Builder date2(String date2){
            this.date2 = date2;
            return this;
        }
        public Builder award2(String award2){
            this.award2 = award2;
            return this;
        }
        public Builder unit2(String unit2){
            this.unit2 = unit2;
            return this;
        }
        public Builder date3(String date3){
            this.date3 = date3;
            return this;
        }
        public Builder award3(String award3){
            this.award3 = award3;
            return this;
        }
        public Builder unit3(String unit3){
            this.unit3 = unit3;
            return this;
        }
        public Builder date4(String date4){
            this.date4 = date4;
            return this;
        }
        public Builder award4(String award4){
            this.award4 = award4;
            return this;
        }
        public Builder unit4(String unit4){
            this.unit4 = unit4;
            return this;
        }
        public Builder applyReason(String applyReason){
            this.applyReason = applyReason;
            return this;
        }
        public Builder recommendReason(String recommendReason){
            this.recommendReason = recommendReason;
            return this;
        }
        public Builder rank(String rank){
            this.rank = rank;
            return this;
        }
        public Builder opinion(String opinion){
            this.opinion = opinion;
            return this;
        }

        public BasicScholarshipBean build(){
            return new BasicScholarshipBean(this);
        }
    }

    public Integer getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Integer timeStart) {
        this.timeStart = timeStart;
    }

    public Integer getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Integer timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCharact() {
        return charact;
    }

    public void setCharact(String charact) {
        this.charact = charact;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getCeRank() {
        return ceRank;
    }

    public void setCeRank(String ceRank) {
        this.ceRank = ceRank;
    }

    public String getGpRank() {
        return gpRank;
    }

    public void setGpRank(String gpRank) {
        this.gpRank = gpRank;
    }

    public String getMajorSum() {
        return majorSum;
    }

    public void setMajorSum(String majorSum) {
        this.majorSum = majorSum;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public String getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(String monthIncome) {
        this.monthIncome = monthIncome;
    }

    public String getFamilySum() {
        return familySum;
    }

    public void setFamilySum(String familySum) {
        this.familySum = familySum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getClassSum() {
        return classSum;
    }

    public void setClassSum(String classSum) {
        this.classSum = classSum;
    }

    public String getPassSum() {
        return passSum;
    }

    public void setPassSum(String passSum) {
        this.passSum = passSum;
    }

    public String getfName1() {
        return fName1;
    }

    public void setfName1(String fName1) {
        this.fName1 = fName1;
    }

    public String getAge1() {
        return age1;
    }

    public void setAge1(String age1) {
        this.age1 = age1;
    }

    public String getRelation1() {
        return relation1;
    }

    public void setRelation1(String relation1) {
        this.relation1 = relation1;
    }

    public String getWorkPlace1() {
        return workPlace1;
    }

    public void setWorkPlace1(String workPlace1) {
        this.workPlace1 = workPlace1;
    }

    public String getfName2() {
        return fName2;
    }

    public void setfName2(String fName2) {
        this.fName2 = fName2;
    }

    public String getAge2() {
        return age2;
    }

    public void setAge2(String age2) {
        this.age2 = age2;
    }

    public String getRelation2() {
        return relation2;
    }

    public void setRelation2(String relation2) {
        this.relation2 = relation2;
    }

    public String getWorkPlace2() {
        return workPlace2;
    }

    public void setWorkPlace2(String workPlace2) {
        this.workPlace2 = workPlace2;
    }

    public String getfName3() {
        return fName3;
    }

    public void setfName3(String fName3) {
        this.fName3 = fName3;
    }

    public String getAge3() {
        return age3;
    }

    public void setAge3(String age3) {
        this.age3 = age3;
    }

    public String getRelation3() {
        return relation3;
    }

    public void setRelation3(String relation3) {
        this.relation3 = relation3;
    }

    public String getWorkPlace3() {
        return workPlace3;
    }

    public void setWorkPlace3(String workPlace3) {
        this.workPlace3 = workPlace3;
    }

    public String getfName4() {
        return fName4;
    }

    public void setfName4(String fName4) {
        this.fName4 = fName4;
    }

    public String getAge4() {
        return age4;
    }

    public void setAge4(String age4) {
        this.age4 = age4;
    }

    public String getRelation4() {
        return relation4;
    }

    public void setRelation4(String relation4) {
        this.relation4 = relation4;
    }

    public String getWorkPlace4() {
        return workPlace4;
    }

    public void setWorkPlace4(String workPlace4) {
        this.workPlace4 = workPlace4;
    }

    public String getfName5() {
        return fName5;
    }

    public void setfName5(String fName5) {
        this.fName5 = fName5;
    }

    public String getAge5() {
        return age5;
    }

    public void setAge5(String age5) {
        this.age5 = age5;
    }

    public String getRelation5() {
        return relation5;
    }

    public void setRelation5(String relation5) {
        this.relation5 = relation5;
    }

    public String getWorkPlace5() {
        return workPlace5;
    }

    public void setWorkPlace5(String workPlace5) {
        this.workPlace5 = workPlace5;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getAward1() {
        return award1;
    }

    public void setAward1(String award1) {
        this.award1 = award1;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getAward2() {
        return award2;
    }

    public void setAward2(String award2) {
        this.award2 = award2;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }

    public String getDate3() {
        return date3;
    }

    public void setDate3(String date3) {
        this.date3 = date3;
    }

    public String getAward3() {
        return award3;
    }

    public void setAward3(String award3) {
        this.award3 = award3;
    }

    public String getUnit3() {
        return unit3;
    }

    public void setUnit3(String unit3) {
        this.unit3 = unit3;
    }

    public String getDate4() {
        return date4;
    }

    public void setDate4(String date4) {
        this.date4 = date4;
    }

    public String getAward4() {
        return award4;
    }

    public void setAward4(String award4) {
        this.award4 = award4;
    }

    public String getUnit4() {
        return unit4;
    }

    public void setUnit4(String unit4) {
        this.unit4 = unit4;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public String getRecommendReason() {
        return recommendReason;
    }

    public void setRecommendReason(String recommendReason) {
        this.recommendReason = recommendReason;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        return "BasicScholarshipBean{" +
                "timeStart=" + timeStart +
                ", timeEnd=" + timeEnd +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", classNum='" + classNum + '\'' +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", account='" + account + '\'' +
                ", birth='" + birth + '\'' +
                ", entrance='" + entrance + '\'' +
                ", phone='" + phone + '\'' +
                ", identity='" + identity + '\'' +
                ", nation='" + nation + '\'' +
                ", political='" + political + '\'' +
                ", job='" + job + '\'' +
                ", charact='" + charact + '\'' +
                ", study='" + study + '\'' +
                ", ability='" + ability + '\'' +
                ", total='" + total + '\'' +
                ", ceRank='" + ceRank + '\'' +
                ", gpRank='" + gpRank + '\'' +
                ", majorSum='" + majorSum + '\'' +
                ", resident='" + resident + '\'' +
                ", incomeSource='" + incomeSource + '\'' +
                ", monthIncome='" + monthIncome + '\'' +
                ", familySum='" + familySum + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", situation='" + situation + '\'' +
                ", classSum='" + classSum + '\'' +
                ", passSum='" + passSum + '\'' +
                ", fName1='" + fName1 + '\'' +
                ", age1='" + age1 + '\'' +
                ", relation1='" + relation1 + '\'' +
                ", workPlace1='" + workPlace1 + '\'' +
                ", fName2='" + fName2 + '\'' +
                ", age2='" + age2 + '\'' +
                ", relation2='" + relation2 + '\'' +
                ", workPlace2='" + workPlace2 + '\'' +
                ", fName3='" + fName3 + '\'' +
                ", age3='" + age3 + '\'' +
                ", relation3='" + relation3 + '\'' +
                ", workPlace3='" + workPlace3 + '\'' +
                ", fName4='" + fName4 + '\'' +
                ", age4='" + age4 + '\'' +
                ", relation4='" + relation4 + '\'' +
                ", workPlace4='" + workPlace4 + '\'' +
                ", fName5='" + fName5 + '\'' +
                ", age5='" + age5 + '\'' +
                ", relation5='" + relation5 + '\'' +
                ", workPlace5='" + workPlace5 + '\'' +
                ", date1='" + date1 + '\'' +
                ", award1='" + award1 + '\'' +
                ", unit1='" + unit1 + '\'' +
                ", date2='" + date2 + '\'' +
                ", award2='" + award2 + '\'' +
                ", unit2='" + unit2 + '\'' +
                ", date3='" + date3 + '\'' +
                ", award3='" + award3 + '\'' +
                ", unit3='" + unit3 + '\'' +
                ", date4='" + date4 + '\'' +
                ", award4='" + award4 + '\'' +
                ", unit4='" + unit4 + '\'' +
                ", applyReason='" + applyReason + '\'' +
                ", recommendReason='" + recommendReason + '\'' +
                ", rank='" + rank + '\'' +
                ", opinion='" + opinion + '\'' +
                '}';
    }
}