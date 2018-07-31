package app;
public enum Gender {

    MALE(1, "MALE"), FEMALE(2, "FEMALE"), OTHER(-1, "OTHER");

    private int code;
    private String nameGender;

    private Gender(int code, String nameGender) {
        this.code = code;
        this.nameGender = nameGender;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameGender() {
        return nameGender;
    }

    public void setNameGender(String nameGender) {
        this.nameGender = nameGender;
    }

    public static Gender getByCode(int code) {

        switch (code) {
            case 1:
                return MALE;
            case 2:
                return FEMALE;
            default:
                return OTHER;
        }
    }
}