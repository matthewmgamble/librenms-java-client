package ca.mgamble.librenms.client.classes;

import com.google.gson.annotations.SerializedName;


public class GraphInfo {
    
    
    @SerializedName("desc")
    private String graphDesc;

    @SerializedName("name")
    private String graphType;

    /**
     * @return the graphDesc
     */
    public String getGraphDesc() {
        return graphDesc;
    }

    /**
     * @param graphDesc the graphDesc to set
     */
    public void setGraphDesc(String graphDesc) {
        this.graphDesc = graphDesc;
    }

    /**
     * @return the graphType
     */
    public String getGraphType() {
        return graphType;
    }

    /**
     * @param graphType the graphType to set
     */
    public void setGraphType(String graphType) {
        this.graphType = graphType;
    }
}