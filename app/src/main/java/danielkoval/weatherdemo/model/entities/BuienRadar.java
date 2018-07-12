
package danielkoval.weatherdemo.model.entities;

import com.google.gson.annotations.Expose;
public class BuienRadar {

    @Expose
    private String copyright;
    @Expose
    private String terms;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

}
