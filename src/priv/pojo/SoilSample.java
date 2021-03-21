package priv.pojo;

/**
 * 土样
 * @author ihch17
 */
public class SoilSample {

    // 钻孔编号
    private String zk_number;

    // 样品编号
    private String yp_number;

    // 取样深度
    private double depth;

    // 液限
    private double wl;

    // 塑性指数
    private double ip;

    // 颗粒组成

    // >20
    private double c_20;

    // 20~2
    private double c_2;

    // 2~0.5
    private double c_point5;

    // 0.5~0.25
    private double c_point25;

    // 0.25~0.075
    private double c_point075;

    // 0.075~0.005
    private double c_point005;

    // 0.005~0
    private double c_0;

    // 不均匀系数
    private double cu;

    // 曲率系数
    private double cc;

    public SoilSample(String zk_number, String yp_number, double depth, double wl, double ip, double c_20, double c_2, double c_point5, double c_point25, double c_point075, double c_point005, double c_0, double cu, double cc) {
        this.zk_number = zk_number;
        this.yp_number = yp_number;
        this.depth = depth;
        this.wl = wl;
        this.ip = ip;
        this.c_20 = c_20;
        this.c_2 = c_2;
        this.c_point5 = c_point5;
        this.c_point25 = c_point25;
        this.c_point075 = c_point075;
        this.c_point005 = c_point005;
        this.c_0 = c_0;
        this.cu = cu;
        this.cc = cc;
    }

    public String getZk_number() {
        return zk_number;
    }

    public void setZk_number(String zk_number) {
        this.zk_number = zk_number;
    }

    public String getYp_number() {
        return yp_number;
    }

    public void setYp_number(String yp_number) {
        this.yp_number = yp_number;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getWl() {
        return wl;
    }

    public void setWl(double wl) {
        this.wl = wl;
    }

    public double getIp() {
        return ip;
    }

    public void setIp(double ip) {
        this.ip = ip;
    }

    public double getC_20() {
        return c_20;
    }

    public void setC_20(double c_20) {
        this.c_20 = c_20;
    }

    public double getC_2() {
        return c_2;
    }

    public void setC_2(double c_2) {
        this.c_2 = c_2;
    }

    public double getC_point5() {
        return c_point5;
    }

    public void setC_point5(double c_point5) {
        this.c_point5 = c_point5;
    }

    public double getC_point25() {
        return c_point25;
    }

    public void setC_point25(double c_point25) {
        this.c_point25 = c_point25;
    }

    public double getC_point075() {
        return c_point075;
    }

    public void setC_point075(double c_point075) {
        this.c_point075 = c_point075;
    }

    public double getC_point005() {
        return c_point005;
    }

    public void setC_point005(double c_point005) {
        this.c_point005 = c_point005;
    }

    public double getC_0() {
        return c_0;
    }

    public void setC_0(double c_0) {
        this.c_0 = c_0;
    }

    public double getCu() {
        return cu;
    }

    public void setCu(double cu) {
        this.cu = cu;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }


    @Override
    public String toString() {
        return "SoilSample{" +
                "zk_number='" + zk_number + '\'' +
                ", yp_number='" + yp_number + '\'' +
                ", depth=" + depth +
                ", wl=" + wl +
                ", ip=" + ip +
                ", c_20=" + c_20 +
                ", c_2=" + c_2 +
                ", c_point5=" + c_point5 +
                ", c_point25=" + c_point25 +
                ", c_point075=" + c_point075 +
                ", c_point005=" + c_point005 +
                ", c_0=" + c_0 +
                ", cu=" + cu +
                ", cc=" + cc +
                '}';
    }
}
