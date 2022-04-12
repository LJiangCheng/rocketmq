import org.apache.commons.lang3.time.DateUtils;
import org.apache.rocketmq.common.namesrv.NamesrvConfig;
import org.apache.rocketmq.namesrv.NamesrvController;
import org.apache.rocketmq.remoting.netty.NettyServerConfig;

public class NameServerStartup {

    public static void main(String[] args) throws Exception {
        //NameServerConfig
        NamesrvConfig namesrvConfig = new NamesrvConfig();
        //NettyServerConfig
        NettyServerConfig nettyServerConfig = new NettyServerConfig();
        nettyServerConfig.setListenPort(9876);
        //NameserverController
        NamesrvController nameSrvController = new NamesrvController(namesrvConfig, nettyServerConfig);
        nameSrvController.initialize();
        nameSrvController.start();
        //sleep
        Thread.sleep(DateUtils.MILLIS_PER_DAY);
    }

}
