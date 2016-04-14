package me.undownding.docker.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by undownding on 16-4-8.
 */
public class Container implements Serializable {

    /**
     * Id : 0b84a06b5c35dd22631eaaac5701ed0f08581f18df804c119392be453991845c
     * Names : ["/dao_qiniu_1"]
     * Image : index.docker.io/library/tomcat:7.0.68-jre7
     * ImageID : c7d285d9b48dc37d3962e0fcb1225be859d5871e2632bf512f1d53a682629a1c
     * Command : catalina.sh run
     * Created : 1456766327
     * Ports : [{"IP":"0.0.0.0","PrivatePort":8080,"PublicPort":10587,"Type":"tcp"}]
     * Labels : {"com.docker.compose.container-number":"1","com.docker.compose.oneoff":"False","com.docker.compose.project":"dao","com.docker.compose.service":"qiniu","com.docker.compose.version":"1.3.3","io.daocloud.sr.microservice-id":"c082b68b-a25d-4a8b-9c4e-5162bc5eccd8"}
     * Status : Up 22 minutes
     * HostConfig : {"NetworkMode":"default"}
     */

    private String Id;
    private String Image;
    private String ImageID;
    private String Command;
    private int Created;
    private String Status;
    private List<String> Names;
    /**
     * IP : 0.0.0.0
     * PrivatePort : 8080
     * PublicPort : 10587
     * Type : tcp
     */

    private List<PortsEntity> Ports;

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    public void setCommand(String Command) {
        this.Command = Command;
    }

    public void setCreated(int Created) {
        this.Created = Created;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setNames(List<String> Names) {
        this.Names = Names;
    }

    public void setPorts(List<PortsEntity> Ports) {
        this.Ports = Ports;
    }

    public String getId() {
        return Id;
    }

    public String getImage() {
        return Image;
    }

    public String getImageID() {
        return ImageID;
    }

    public String getCommand() {
        return Command;
    }

    public int getCreated() {
        return Created;
    }

    public String getStatus() {
        return Status;
    }

    public List<String> getNames() {
        return Names;
    }

    public List<PortsEntity> getPorts() {
        return Ports;
    }

    public static class PortsEntity {
        private String IP;
        private int PrivatePort;
        private int PublicPort;
        private String Type;

        public void setIP(String IP) {
            this.IP = IP;
        }

        public void setPrivatePort(int PrivatePort) {
            this.PrivatePort = PrivatePort;
        }

        public void setPublicPort(int PublicPort) {
            this.PublicPort = PublicPort;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public String getIP() {
            return IP;
        }

        public int getPrivatePort() {
            return PrivatePort;
        }

        public int getPublicPort() {
            return PublicPort;
        }

        public String getType() {
            return Type;
        }
    }
}
