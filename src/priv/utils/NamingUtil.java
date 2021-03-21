package priv.utils;


import priv.pojo.SoilSample;

/**
 * 土样命名工具类
 * @author ihch17
 */
public class NamingUtil {

    /**
     *
     * @param temp 土样
     * @return 土样描述
     */
    public String namingMethod(SoilSample temp){

        // 粗粒土含量
        double hl_cl = temp.getC_20() + temp.getC_2() + temp.getC_point5() + temp.getC_point25() + temp.getC_point075();

        // 细粒土含量
        double hl_xl = temp.getC_point005() + temp.getC_0();

        // 粗粒土中
        // 砾粒土含量
        double hl_cl_ll = temp.getC_20() + temp.getC_2();

        // 沙粒土含量
        double hl_cl_sl = temp.getC_point5() + temp.getC_point25() + temp.getC_point075();

        // 细粒组中粉粒含量
        double hl_cl_fl = temp.getC_point005()/(temp.getC_point005()+temp.getC_0());

        // 返回结果
        String result = null;

        // 判断粗、细粒土
        // 粗粒土
        if(hl_cl >= hl_xl){
            //判断砾粒、沙粒
            // 砾粒
            if(hl_cl_ll > hl_cl_sl){
                // 级配良好砾
                if(hl_xl < 5 && temp.getCc() >= 5 && temp.getCu() <= 3 &&  temp.getCu() >= 1){
                    result = "级配良好砾";
                }
                // 级配不良砾
                else if(hl_xl < 5 && (temp.getCu()<5 || temp.getCc() < 1 || temp.getCc() > 3)){
                    result = "级配不良砾";
                }
                // 含细粒土粒
                else if(hl_xl >= 5 && hl_xl < 15){
                    result = "含细粒土砾";
                }
                // 粘土质砾
                else if(hl_xl >= 15 && hl_xl <50 && hl_cl_fl <= 0.5){
                    result = "粘土质砾";
                }
                // 粉土质砾
                else if (hl_xl >= 15 && hl_xl <50 && hl_cl_fl > 0.5){
                    result = "粉土质砾";
                }
            }
            // 沙粒
            else{
                // 级配良好沙
                if(hl_xl < 5 && temp.getCu() > 5 && temp.getCc() >= 1 && temp.getCc()<=3){
                    result = "级配良好沙";
                }
                // 级配不良沙
                else if(hl_xl < 5 && hl_xl < 5 && (temp.getCu() < 5 || temp.getCc() < 1 || temp.getCc() > 3)){
                    result = "级配不良沙";
                }
                // 含细粒土沙
                else if(hl_xl >= 5 && hl_xl < 15){
                    result = "含细粒土沙";
                }
                // 黏土质沙
                else if(hl_xl >= 15 && hl_xl < 50 && hl_cl_fl <= 50){
                    result = "黏土质沙";
                }
                //粉土质沙
                else if (hl_xl >= 15 && hl_xl < 50 && hl_cl_fl > 50){
                    result = "粉土质沙";
                }
            }
        }
        // 细粒土
        else{
            // 高液限黏土
            if(temp.getIp() >= (0.73 * (temp.getWl() - 20)) && temp.getIp() >= 7 && temp.getWl() >= 50){
                result = "高液限黏土";
            }
            // 低液限黏土
            else if(temp.getIp() >= (0.73 * (temp.getWl() - 20)) && temp.getIp() >= 7 && temp.getWl() < 50){
                result = "低液限黏土";
            }
            // 高液限粉土
            else if((temp.getIp() < (0.73 * (temp.getWl() - 20)) || temp.getIp()<4) && temp.getWl() >= 50){
                result = "高液限粉土";
            }
            // 低液限粉土
            else if((temp.getIp() < (0.73 * (temp.getWl() - 20)) || temp.getIp()<4) && temp.getWl() < 50){
                result = "低液限粉土";
            }
        }

        return result;
    }
}
