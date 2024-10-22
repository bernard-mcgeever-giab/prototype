public class Film extends Show<Film> {
    private String title;
    private String format;
    private String thumbnailLocation;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getThumbnailLocation() {
        return thumbnailLocation;
    }

    public void setThumbnailLocation(String thumbnailLocation) {
        this.thumbnailLocation = thumbnailLocation;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", format='" + format + '\'' +
                ", thumbnailLocation='" + thumbnailLocation + '\'' +
                '}';
    }
}
