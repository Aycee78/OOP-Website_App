public class Location {
    private String mun_code;
    private String mun;
    private String rdo_code;

    public Location(String mun_code, String mun, String rdo_code) {
        this.mun_code = mun_code;
        this.mun = mun;
        this.rdo_code = rdo_code;
    }

    public String getMun_code() {
        return mun_code;
    }

    public void setMun_code(String mun_code) {
        this.mun_code = mun_code;
    }

    public String getMun() {
        return mun;
    }

    public void setMun(String mun) {
        this.mun = mun;
    }

    public String getRdo_code() {
        return rdo_code;
    }

    public void setRdo_code(String rdo_code) {
        this.rdo_code = rdo_code;
    }

    @Override
    public String toString() {
        return mun + " (" + mun_code + ")";
    }
}