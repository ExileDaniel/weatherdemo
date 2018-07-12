
package danielkoval.weatherdemo.model.entities;

import com.google.gson.annotations.Expose;
public class Weatherreport {

    @Expose
    private String author;
    @Expose
    private String authorbio;
    @Expose
    private String published;
    @Expose
    private String summary;
    @Expose
    private String title;
    @Expose
    private String url;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorbio() {
        return authorbio;
    }

    public void setAuthorbio(String authorbio) {
        this.authorbio = authorbio;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
