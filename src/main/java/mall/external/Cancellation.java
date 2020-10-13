package mall.external;

public class Cancellation {

    private Long id;
    private Long oderId;
    private String status;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getOderId() {
        return oderId;
    }
    public void setOderId(Long oderId) {
        this.oderId = oderId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

}
