package me.undownding.docker.model;

import java.util.List;

/**
 * Created by undownding on 16-4-8.
 */
public class ContainerDetail {

    /**
     * Id : 72a1769c41b7e430e54a8f239a8c9451ec71b6f2937fc03e0accd6bce84a2c7b
     * Created : 2016-02-15T03:34:29.617865857Z
     * Path : docker/start.sh
     * Args : ["/bin/s6-svscan","/app/gogs/docker/s6/"]
     * State : {"Status":"running","Running":true,"Paused":false,"Restarting":false,"OOMKilled":false,"Dead":false,"Pid":20886,"ExitCode":0,"Error":"","StartedAt":"2016-04-08T03:30:19.621298905Z","FinishedAt":"2016-04-08T03:30:07.334765294Z"}
     * Image : 48314549313e3740415f33100cd0857dea06cbd80f3b455e4796f7ef0c333c57
     * ResolvConfPath : /var/lib/docker/containers/72a1769c41b7e430e54a8f239a8c9451ec71b6f2937fc03e0accd6bce84a2c7b/resolv.conf
     * HostnamePath : /var/lib/docker/containers/72a1769c41b7e430e54a8f239a8c9451ec71b6f2937fc03e0accd6bce84a2c7b/hostname
     * HostsPath : /var/lib/docker/containers/72a1769c41b7e430e54a8f239a8c9451ec71b6f2937fc03e0accd6bce84a2c7b/hosts
     * LogPath : /var/lib/docker/containers/72a1769c41b7e430e54a8f239a8c9451ec71b6f2937fc03e0accd6bce84a2c7b/72a1769c41b7e430e54a8f239a8c9451ec71b6f2937fc03e0accd6bce84a2c7b-json.log
     * Name : /gogs
     * RestartCount : 0
     * Driver : aufs
     * ExecDriver : native-0.2
     * MountLabel :
     * ProcessLabel :
     * AppArmorProfile :
     * ExecIDs : null
     * HostConfig : {"Binds":["/opt/gogs:/data"],"ContainerIDFile":"","LxcConf":[],"Memory":0,"MemoryReservation":0,"MemorySwap":0,"KernelMemory":0,"CpuShares":0,"CpuPeriod":0,"CpusetCpus":"","CpusetMems":"","CpuQuota":0,"BlkioWeight":0,"OomKillDisable":false,"MemorySwappiness":-1,"Privileged":false,"PortBindings":{"22/tcp":[{"HostIp":"","HostPort":"22"}],"3000/tcp":[{"HostIp":"","HostPort":"10080"}]},"Links":null,"PublishAllPorts":false,"Dns":[],"DnsOptions":[],"DnsSearch":[],"ExtraHosts":null,"VolumesFrom":null,"Devices":[],"NetworkMode":"default","IpcMode":"","PidMode":"","UTSMode":"","CapAdd":null,"CapDrop":null,"GroupAdd":null,"RestartPolicy":{"Name":"always","MaximumRetryCount":0},"SecurityOpt":null,"ReadonlyRootfs":false,"Ulimits":null,"LogConfig":{"Type":"json-file","Config":{}},"CgroupParent":"","ConsoleSize":[0,0],"VolumeDriver":""}
     * GraphDriver : {"Name":"aufs","Data":null}
     * Mounts : [{"Source":"/opt/gogs","Destination":"/data","Mode":"","RW":true}]
     * Config : {"Hostname":"72a1769c41b7","Domainname":"","User":"","AttachStdin":false,"AttachStdout":false,"AttachStderr":false,"ExposedPorts":{"22/tcp":{},"3000/tcp":{}},"Tty":false,"OpenStdin":false,"StdinOnce":false,"Env":["PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin","GOGS_CUSTOM=/data/gogs"],"Cmd":["/bin/s6-svscan","/app/gogs/docker/s6/"],"Image":"gogs/gogs","Volumes":{"/data":{}},"WorkingDir":"/app/gogs","Entrypoint":["docker/start.sh"],"OnBuild":null,"Labels":{},"StopSignal":"SIGTERM"}
     * NetworkSettings : {"Bridge":"","SandboxID":"2282fb48b6e6cf57e93dae443576221a42075ad3494d7eee24af1cc67b2eaf24","HairpinMode":false,"LinkLocalIPv6Address":"","LinkLocalIPv6PrefixLen":0,"Ports":{"22/tcp":[{"HostIp":"0.0.0.0","HostPort":"22"}],"3000/tcp":[{"HostIp":"0.0.0.0","HostPort":"10080"}]},"SandboxKey":"/var/run/docker/netns/2282fb48b6e6","SecondaryIPAddresses":null,"SecondaryIPv6Addresses":null,"EndpointID":"7ae387e6a901beb730da1595d878862cdba1ae6681789860f60dafc1676ad04c","Gateway":"172.17.0.1","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"IPAddress":"172.17.0.8","IPPrefixLen":16,"IPv6Gateway":"","MacAddress":"02:42:ac:11:00:08","Networks":{"bridge":{"EndpointID":"7ae387e6a901beb730da1595d878862cdba1ae6681789860f60dafc1676ad04c","Gateway":"172.17.0.1","IPAddress":"172.17.0.8","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:ac:11:00:08"}}}
     */

    private String Id;
    private String Created;
    private String Path;
    /**
     * Status : running
     * Running : true
     * Paused : false
     * Restarting : false
     * OOMKilled : false
     * Dead : false
     * Pid : 20886
     * ExitCode : 0
     * Error :
     * StartedAt : 2016-04-08T03:30:19.621298905Z
     * FinishedAt : 2016-04-08T03:30:07.334765294Z
     */

    private StateEntity State;
    private String Image;
    private String ResolvConfPath;
    private String HostnamePath;
    private String HostsPath;
    private String LogPath;
    private String Name;
    private int RestartCount;
    private String Driver;
    private String ExecDriver;
    private String MountLabel;
    private String ProcessLabel;
    private String AppArmorProfile;
    private Object ExecIDs;
    /**
     * Binds : ["/opt/gogs:/data"]
     * ContainerIDFile :
     * LxcConf : []
     * Memory : 0
     * MemoryReservation : 0
     * MemorySwap : 0
     * KernelMemory : 0
     * CpuShares : 0
     * CpuPeriod : 0
     * CpusetCpus :
     * CpusetMems :
     * CpuQuota : 0
     * BlkioWeight : 0
     * OomKillDisable : false
     * MemorySwappiness : -1
     * Privileged : false
     * PortBindings : {"22/tcp":[{"HostIp":"","HostPort":"22"}],"3000/tcp":[{"HostIp":"","HostPort":"10080"}]}
     * Links : null
     * PublishAllPorts : false
     * Dns : []
     * DnsOptions : []
     * DnsSearch : []
     * ExtraHosts : null
     * VolumesFrom : null
     * Devices : []
     * NetworkMode : default
     * IpcMode :
     * PidMode :
     * UTSMode :
     * CapAdd : null
     * CapDrop : null
     * GroupAdd : null
     * RestartPolicy : {"Name":"always","MaximumRetryCount":0}
     * SecurityOpt : null
     * ReadonlyRootfs : false
     * Ulimits : null
     * LogConfig : {"Type":"json-file","Config":{}}
     * CgroupParent :
     * ConsoleSize : [0,0]
     * VolumeDriver :
     */

    private HostConfigEntity HostConfig;
    /**
     * Name : aufs
     * Data : null
     */

    private GraphDriverEntity GraphDriver;
    /**
     * Hostname : 72a1769c41b7
     * Domainname :
     * User :
     * AttachStdin : false
     * AttachStdout : false
     * AttachStderr : false
     * ExposedPorts : {"22/tcp":{},"3000/tcp":{}}
     * Tty : false
     * OpenStdin : false
     * StdinOnce : false
     * Env : ["PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin","GOGS_CUSTOM=/data/gogs"]
     * Cmd : ["/bin/s6-svscan","/app/gogs/docker/s6/"]
     * Image : gogs/gogs
     * Volumes : {"/data":{}}
     * WorkingDir : /app/gogs
     * Entrypoint : ["docker/start.sh"]
     * OnBuild : null
     * Labels : {}
     * StopSignal : SIGTERM
     */

    private ConfigEntity Config;
    /**
     * Bridge :
     * SandboxID : 2282fb48b6e6cf57e93dae443576221a42075ad3494d7eee24af1cc67b2eaf24
     * HairpinMode : false
     * LinkLocalIPv6Address :
     * LinkLocalIPv6PrefixLen : 0
     * Ports : {"22/tcp":[{"HostIp":"0.0.0.0","HostPort":"22"}],"3000/tcp":[{"HostIp":"0.0.0.0","HostPort":"10080"}]}
     * SandboxKey : /var/run/docker/netns/2282fb48b6e6
     * SecondaryIPAddresses : null
     * SecondaryIPv6Addresses : null
     * EndpointID : 7ae387e6a901beb730da1595d878862cdba1ae6681789860f60dafc1676ad04c
     * Gateway : 172.17.0.1
     * GlobalIPv6Address :
     * GlobalIPv6PrefixLen : 0
     * IPAddress : 172.17.0.8
     * IPPrefixLen : 16
     * IPv6Gateway :
     * MacAddress : 02:42:ac:11:00:08
     * Networks : {"bridge":{"EndpointID":"7ae387e6a901beb730da1595d878862cdba1ae6681789860f60dafc1676ad04c","Gateway":"172.17.0.1","IPAddress":"172.17.0.8","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:ac:11:00:08"}}
     */

    private NetworkSettingsEntity NetworkSettings;
    private List<String> Args;
    /**
     * Source : /opt/gogs
     * Destination : /data
     * Mode :
     * RW : true
     */

    private List<MountsEntity> Mounts;

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setCreated(String Created) {
        this.Created = Created;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public void setState(StateEntity State) {
        this.State = State;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public void setResolvConfPath(String ResolvConfPath) {
        this.ResolvConfPath = ResolvConfPath;
    }

    public void setHostnamePath(String HostnamePath) {
        this.HostnamePath = HostnamePath;
    }

    public void setHostsPath(String HostsPath) {
        this.HostsPath = HostsPath;
    }

    public void setLogPath(String LogPath) {
        this.LogPath = LogPath;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setRestartCount(int RestartCount) {
        this.RestartCount = RestartCount;
    }

    public void setDriver(String Driver) {
        this.Driver = Driver;
    }

    public void setExecDriver(String ExecDriver) {
        this.ExecDriver = ExecDriver;
    }

    public void setMountLabel(String MountLabel) {
        this.MountLabel = MountLabel;
    }

    public void setProcessLabel(String ProcessLabel) {
        this.ProcessLabel = ProcessLabel;
    }

    public void setAppArmorProfile(String AppArmorProfile) {
        this.AppArmorProfile = AppArmorProfile;
    }

    public void setExecIDs(Object ExecIDs) {
        this.ExecIDs = ExecIDs;
    }

    public void setHostConfig(HostConfigEntity HostConfig) {
        this.HostConfig = HostConfig;
    }

    public void setGraphDriver(GraphDriverEntity GraphDriver) {
        this.GraphDriver = GraphDriver;
    }

    public void setConfig(ConfigEntity Config) {
        this.Config = Config;
    }

    public void setNetworkSettings(NetworkSettingsEntity NetworkSettings) {
        this.NetworkSettings = NetworkSettings;
    }

    public void setArgs(List<String> Args) {
        this.Args = Args;
    }

    public void setMounts(List<MountsEntity> Mounts) {
        this.Mounts = Mounts;
    }

    public String getId() {
        return Id;
    }

    public String getCreated() {
        return Created;
    }

    public String getPath() {
        return Path;
    }

    public StateEntity getState() {
        return State;
    }

    public String getImage() {
        return Image;
    }

    public String getResolvConfPath() {
        return ResolvConfPath;
    }

    public String getHostnamePath() {
        return HostnamePath;
    }

    public String getHostsPath() {
        return HostsPath;
    }

    public String getLogPath() {
        return LogPath;
    }

    public String getName() {
        return Name;
    }

    public int getRestartCount() {
        return RestartCount;
    }

    public String getDriver() {
        return Driver;
    }

    public String getExecDriver() {
        return ExecDriver;
    }

    public String getMountLabel() {
        return MountLabel;
    }

    public String getProcessLabel() {
        return ProcessLabel;
    }

    public String getAppArmorProfile() {
        return AppArmorProfile;
    }

    public Object getExecIDs() {
        return ExecIDs;
    }

    public HostConfigEntity getHostConfig() {
        return HostConfig;
    }

    public GraphDriverEntity getGraphDriver() {
        return GraphDriver;
    }

    public ConfigEntity getConfig() {
        return Config;
    }

    public NetworkSettingsEntity getNetworkSettings() {
        return NetworkSettings;
    }

    public List<String> getArgs() {
        return Args;
    }

    public List<MountsEntity> getMounts() {
        return Mounts;
    }

    public static class StateEntity {
        private String Status;
        private boolean Running;
        private boolean Paused;
        private boolean Restarting;
        private boolean OOMKilled;
        private boolean Dead;
        private int Pid;
        private int ExitCode;
        private String Error;
        private String StartedAt;
        private String FinishedAt;

        public void setStatus(String Status) {
            this.Status = Status;
        }

        public void setRunning(boolean Running) {
            this.Running = Running;
        }

        public void setPaused(boolean Paused) {
            this.Paused = Paused;
        }

        public void setRestarting(boolean Restarting) {
            this.Restarting = Restarting;
        }

        public void setOOMKilled(boolean OOMKilled) {
            this.OOMKilled = OOMKilled;
        }

        public void setDead(boolean Dead) {
            this.Dead = Dead;
        }

        public void setPid(int Pid) {
            this.Pid = Pid;
        }

        public void setExitCode(int ExitCode) {
            this.ExitCode = ExitCode;
        }

        public void setError(String Error) {
            this.Error = Error;
        }

        public void setStartedAt(String StartedAt) {
            this.StartedAt = StartedAt;
        }

        public void setFinishedAt(String FinishedAt) {
            this.FinishedAt = FinishedAt;
        }

        public String getStatus() {
            return Status;
        }

        public boolean isRunning() {
            return Running;
        }

        public boolean isPaused() {
            return Paused;
        }

        public boolean isRestarting() {
            return Restarting;
        }

        public boolean isOOMKilled() {
            return OOMKilled;
        }

        public boolean isDead() {
            return Dead;
        }

        public int getPid() {
            return Pid;
        }

        public int getExitCode() {
            return ExitCode;
        }

        public String getError() {
            return Error;
        }

        public String getStartedAt() {
            return StartedAt;
        }

        public String getFinishedAt() {
            return FinishedAt;
        }
    }

    public static class HostConfigEntity {
        private String ContainerIDFile;
        private int Memory;
        private int MemoryReservation;
        private int MemorySwap;
        private int KernelMemory;
        private int CpuShares;
        private int CpuPeriod;
        private String CpusetCpus;
        private String CpusetMems;
        private int CpuQuota;
        private int BlkioWeight;
        private boolean OomKillDisable;
        private int MemorySwappiness;
        private boolean Privileged;
        private boolean PublishAllPorts;
        /**
         * Name : always
         * MaximumRetryCount : 0
         */

        private RestartPolicyEntity RestartPolicy;
        private boolean ReadonlyRootfs;
        /**
         * Type : json-file
         * Config : {}
         */

        private LogConfigEntity LogConfig;
        private String CgroupParent;
        private String VolumeDriver;
        private List<Integer> ConsoleSize;

        public void setContainerIDFile(String ContainerIDFile) {
            this.ContainerIDFile = ContainerIDFile;
        }

        public void setMemory(int Memory) {
            this.Memory = Memory;
        }

        public void setMemoryReservation(int MemoryReservation) {
            this.MemoryReservation = MemoryReservation;
        }

        public void setMemorySwap(int MemorySwap) {
            this.MemorySwap = MemorySwap;
        }

        public void setKernelMemory(int KernelMemory) {
            this.KernelMemory = KernelMemory;
        }

        public void setCpuShares(int CpuShares) {
            this.CpuShares = CpuShares;
        }

        public void setCpuPeriod(int CpuPeriod) {
            this.CpuPeriod = CpuPeriod;
        }

        public void setCpusetCpus(String CpusetCpus) {
            this.CpusetCpus = CpusetCpus;
        }

        public void setCpusetMems(String CpusetMems) {
            this.CpusetMems = CpusetMems;
        }

        public void setCpuQuota(int CpuQuota) {
            this.CpuQuota = CpuQuota;
        }

        public void setBlkioWeight(int BlkioWeight) {
            this.BlkioWeight = BlkioWeight;
        }

        public void setOomKillDisable(boolean OomKillDisable) {
            this.OomKillDisable = OomKillDisable;
        }

        public void setMemorySwappiness(int MemorySwappiness) {
            this.MemorySwappiness = MemorySwappiness;
        }

        public void setPrivileged(boolean Privileged) {
            this.Privileged = Privileged;
        }

        public void setPublishAllPorts(boolean PublishAllPorts) {
            this.PublishAllPorts = PublishAllPorts;
        }

        public void setRestartPolicy(RestartPolicyEntity RestartPolicy) {
            this.RestartPolicy = RestartPolicy;
        }

        public void setReadonlyRootfs(boolean ReadonlyRootfs) {
            this.ReadonlyRootfs = ReadonlyRootfs;
        }

        public void setLogConfig(LogConfigEntity LogConfig) {
            this.LogConfig = LogConfig;
        }

        public void setCgroupParent(String CgroupParent) {
            this.CgroupParent = CgroupParent;
        }

        public void setVolumeDriver(String VolumeDriver) {
            this.VolumeDriver = VolumeDriver;
        }

        public void setConsoleSize(List<Integer> ConsoleSize) {
            this.ConsoleSize = ConsoleSize;
        }

        public String getContainerIDFile() {
            return ContainerIDFile;
        }

        public int getMemory() {
            return Memory;
        }

        public int getMemoryReservation() {
            return MemoryReservation;
        }

        public int getMemorySwap() {
            return MemorySwap;
        }

        public int getKernelMemory() {
            return KernelMemory;
        }

        public int getCpuShares() {
            return CpuShares;
        }

        public int getCpuPeriod() {
            return CpuPeriod;
        }

        public String getCpusetCpus() {
            return CpusetCpus;
        }

        public String getCpusetMems() {
            return CpusetMems;
        }

        public int getCpuQuota() {
            return CpuQuota;
        }

        public int getBlkioWeight() {
            return BlkioWeight;
        }

        public boolean isOomKillDisable() {
            return OomKillDisable;
        }

        public int getMemorySwappiness() {
            return MemorySwappiness;
        }

        public boolean isPrivileged() {
            return Privileged;
        }

        public boolean isPublishAllPorts() {
            return PublishAllPorts;
        }

        public RestartPolicyEntity getRestartPolicy() {
            return RestartPolicy;
        }

        public boolean isReadonlyRootfs() {
            return ReadonlyRootfs;
        }

        public LogConfigEntity getLogConfig() {
            return LogConfig;
        }

        public String getCgroupParent() {
            return CgroupParent;
        }

        public String getVolumeDriver() {
            return VolumeDriver;
        }

        public List<Integer> getConsoleSize() {
            return ConsoleSize;
        }

        public static class RestartPolicyEntity {
            private String Name;
            private int MaximumRetryCount;

            public void setName(String Name) {
                this.Name = Name;
            }

            public void setMaximumRetryCount(int MaximumRetryCount) {
                this.MaximumRetryCount = MaximumRetryCount;
            }

            public String getName() {
                return Name;
            }

            public int getMaximumRetryCount() {
                return MaximumRetryCount;
            }
        }

        public static class LogConfigEntity {
            private String Type;

            public void setType(String Type) {
                this.Type = Type;
            }

            public String getType() {
                return Type;
            }
        }
    }

    public static class GraphDriverEntity {
        private String Name;
        private Object Data;

        public void setName(String Name) {
            this.Name = Name;
        }

        public void setData(Object Data) {
            this.Data = Data;
        }

        public String getName() {
            return Name;
        }

        public Object getData() {
            return Data;
        }
    }

    public static class ConfigEntity {
        private String Hostname;
        private String Domainname;
        private String User;
        private boolean AttachStdin;
        private boolean AttachStdout;
        private boolean AttachStderr;
        private boolean Tty;
        private boolean OpenStdin;
        private boolean StdinOnce;
        private String Image;
        private String WorkingDir;
        private String StopSignal;
        private List<String> Env;
        private List<String> Cmd;
        private List<String> Entrypoint;

        public void setHostname(String Hostname) {
            this.Hostname = Hostname;
        }

        public void setDomainname(String Domainname) {
            this.Domainname = Domainname;
        }

        public void setUser(String User) {
            this.User = User;
        }

        public void setAttachStdin(boolean AttachStdin) {
            this.AttachStdin = AttachStdin;
        }

        public void setAttachStdout(boolean AttachStdout) {
            this.AttachStdout = AttachStdout;
        }

        public void setAttachStderr(boolean AttachStderr) {
            this.AttachStderr = AttachStderr;
        }

        public void setTty(boolean Tty) {
            this.Tty = Tty;
        }

        public void setOpenStdin(boolean OpenStdin) {
            this.OpenStdin = OpenStdin;
        }

        public void setStdinOnce(boolean StdinOnce) {
            this.StdinOnce = StdinOnce;
        }

        public void setImage(String Image) {
            this.Image = Image;
        }

        public void setWorkingDir(String WorkingDir) {
            this.WorkingDir = WorkingDir;
        }

        public void setStopSignal(String StopSignal) {
            this.StopSignal = StopSignal;
        }

        public void setEnv(List<String> Env) {
            this.Env = Env;
        }

        public void setCmd(List<String> Cmd) {
            this.Cmd = Cmd;
        }

        public void setEntrypoint(List<String> Entrypoint) {
            this.Entrypoint = Entrypoint;
        }

        public String getHostname() {
            return Hostname;
        }

        public String getDomainname() {
            return Domainname;
        }

        public String getUser() {
            return User;
        }

        public boolean isAttachStdin() {
            return AttachStdin;
        }

        public boolean isAttachStdout() {
            return AttachStdout;
        }

        public boolean isAttachStderr() {
            return AttachStderr;
        }

        public boolean isTty() {
            return Tty;
        }

        public boolean isOpenStdin() {
            return OpenStdin;
        }

        public boolean isStdinOnce() {
            return StdinOnce;
        }

        public String getImage() {
            return Image;
        }

        public String getWorkingDir() {
            return WorkingDir;
        }

        public String getStopSignal() {
            return StopSignal;
        }

        public List<String> getEnv() {
            return Env;
        }

        public List<String> getCmd() {
            return Cmd;
        }

        public List<String> getEntrypoint() {
            return Entrypoint;
        }
    }

    public static class NetworkSettingsEntity {
        private String Bridge;
        private String SandboxID;
        private boolean HairpinMode;
        private String LinkLocalIPv6Address;
        private int LinkLocalIPv6PrefixLen;
        private String SandboxKey;
        private String EndpointID;
        private String Gateway;
        private String GlobalIPv6Address;
        private int GlobalIPv6PrefixLen;
        private String IPAddress;
        private int IPPrefixLen;
        private String IPv6Gateway;
        private String MacAddress;
        /**
         * bridge : {"EndpointID":"7ae387e6a901beb730da1595d878862cdba1ae6681789860f60dafc1676ad04c","Gateway":"172.17.0.1","IPAddress":"172.17.0.8","IPPrefixLen":16,"IPv6Gateway":"","GlobalIPv6Address":"","GlobalIPv6PrefixLen":0,"MacAddress":"02:42:ac:11:00:08"}
         */

        private NetworksEntity Networks;

        public void setBridge(String Bridge) {
            this.Bridge = Bridge;
        }

        public void setSandboxID(String SandboxID) {
            this.SandboxID = SandboxID;
        }

        public void setHairpinMode(boolean HairpinMode) {
            this.HairpinMode = HairpinMode;
        }

        public void setLinkLocalIPv6Address(String LinkLocalIPv6Address) {
            this.LinkLocalIPv6Address = LinkLocalIPv6Address;
        }

        public void setLinkLocalIPv6PrefixLen(int LinkLocalIPv6PrefixLen) {
            this.LinkLocalIPv6PrefixLen = LinkLocalIPv6PrefixLen;
        }

        public void setSandboxKey(String SandboxKey) {
            this.SandboxKey = SandboxKey;
        }

        public void setEndpointID(String EndpointID) {
            this.EndpointID = EndpointID;
        }

        public void setGateway(String Gateway) {
            this.Gateway = Gateway;
        }

        public void setGlobalIPv6Address(String GlobalIPv6Address) {
            this.GlobalIPv6Address = GlobalIPv6Address;
        }

        public void setGlobalIPv6PrefixLen(int GlobalIPv6PrefixLen) {
            this.GlobalIPv6PrefixLen = GlobalIPv6PrefixLen;
        }

        public void setIPAddress(String IPAddress) {
            this.IPAddress = IPAddress;
        }

        public void setIPPrefixLen(int IPPrefixLen) {
            this.IPPrefixLen = IPPrefixLen;
        }

        public void setIPv6Gateway(String IPv6Gateway) {
            this.IPv6Gateway = IPv6Gateway;
        }

        public void setMacAddress(String MacAddress) {
            this.MacAddress = MacAddress;
        }

        public void setNetworks(NetworksEntity Networks) {
            this.Networks = Networks;
        }

        public String getBridge() {
            return Bridge;
        }

        public String getSandboxID() {
            return SandboxID;
        }

        public boolean isHairpinMode() {
            return HairpinMode;
        }

        public String getLinkLocalIPv6Address() {
            return LinkLocalIPv6Address;
        }

        public int getLinkLocalIPv6PrefixLen() {
            return LinkLocalIPv6PrefixLen;
        }

        public String getSandboxKey() {
            return SandboxKey;
        }

        public String getEndpointID() {
            return EndpointID;
        }

        public String getGateway() {
            return Gateway;
        }

        public String getGlobalIPv6Address() {
            return GlobalIPv6Address;
        }

        public int getGlobalIPv6PrefixLen() {
            return GlobalIPv6PrefixLen;
        }

        public String getIPAddress() {
            return IPAddress;
        }

        public int getIPPrefixLen() {
            return IPPrefixLen;
        }

        public String getIPv6Gateway() {
            return IPv6Gateway;
        }

        public String getMacAddress() {
            return MacAddress;
        }

        public NetworksEntity getNetworks() {
            return Networks;
        }

        public static class NetworksEntity {
            /**
             * EndpointID : 7ae387e6a901beb730da1595d878862cdba1ae6681789860f60dafc1676ad04c
             * Gateway : 172.17.0.1
             * IPAddress : 172.17.0.8
             * IPPrefixLen : 16
             * IPv6Gateway :
             * GlobalIPv6Address :
             * GlobalIPv6PrefixLen : 0
             * MacAddress : 02:42:ac:11:00:08
             */

            private BridgeEntity bridge;

            public void setBridge(BridgeEntity bridge) {
                this.bridge = bridge;
            }

            public BridgeEntity getBridge() {
                return bridge;
            }

            public static class BridgeEntity {
                private String EndpointID;
                private String Gateway;
                private String IPAddress;
                private int IPPrefixLen;
                private String IPv6Gateway;
                private String GlobalIPv6Address;
                private int GlobalIPv6PrefixLen;
                private String MacAddress;

                public void setEndpointID(String EndpointID) {
                    this.EndpointID = EndpointID;
                }

                public void setGateway(String Gateway) {
                    this.Gateway = Gateway;
                }

                public void setIPAddress(String IPAddress) {
                    this.IPAddress = IPAddress;
                }

                public void setIPPrefixLen(int IPPrefixLen) {
                    this.IPPrefixLen = IPPrefixLen;
                }

                public void setIPv6Gateway(String IPv6Gateway) {
                    this.IPv6Gateway = IPv6Gateway;
                }

                public void setGlobalIPv6Address(String GlobalIPv6Address) {
                    this.GlobalIPv6Address = GlobalIPv6Address;
                }

                public void setGlobalIPv6PrefixLen(int GlobalIPv6PrefixLen) {
                    this.GlobalIPv6PrefixLen = GlobalIPv6PrefixLen;
                }

                public void setMacAddress(String MacAddress) {
                    this.MacAddress = MacAddress;
                }

                public String getEndpointID() {
                    return EndpointID;
                }

                public String getGateway() {
                    return Gateway;
                }

                public String getIPAddress() {
                    return IPAddress;
                }

                public int getIPPrefixLen() {
                    return IPPrefixLen;
                }

                public String getIPv6Gateway() {
                    return IPv6Gateway;
                }

                public String getGlobalIPv6Address() {
                    return GlobalIPv6Address;
                }

                public int getGlobalIPv6PrefixLen() {
                    return GlobalIPv6PrefixLen;
                }

                public String getMacAddress() {
                    return MacAddress;
                }
            }
        }
    }

    public static class MountsEntity {
        private String Source;
        private String Destination;
        private String Mode;
        private boolean RW;

        public void setSource(String Source) {
            this.Source = Source;
        }

        public void setDestination(String Destination) {
            this.Destination = Destination;
        }

        public void setMode(String Mode) {
            this.Mode = Mode;
        }

        public void setRW(boolean RW) {
            this.RW = RW;
        }

        public String getSource() {
            return Source;
        }

        public String getDestination() {
            return Destination;
        }

        public String getMode() {
            return Mode;
        }

        public boolean isRW() {
            return RW;
        }
    }
}
