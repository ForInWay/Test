package com.morgan.vm;


/**
 * @Description Java栈溢出(虚拟机栈、本地方法栈)-StackOverFlowError
 * 启动参数设置：-Xss 128k
 * @Author Morgan
 * @Date 2021/1/4 15:02
 **/
public class JavaVMStackSOF2 {

    private static int stackLength = 0;

    public static void test(){
        long s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,
                s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32,s33,s34,s35,s36,s37,s38,s39,s40,
                s41,s42,s43,s44,s45,s46,s47,s48,s49,s50,s51,s52,s53,s54,s55,s56,s57,s58,s59,s60,
                s61,s62,s63,s64,s65,s66,s67,s68,s69,s70,s71,s72,s73,s74,s75,s76,s77,s78,s79,s80,
                s81,s82,s83,s84,s85,s86,s87,s88,s89,s90,s91,s92,s93,s94,s95,s96,s97,s98,s99,s100;
        stackLength++;
        test();
        s1 = s2 = s3 = s4 = s5 = s6 = s7 = s8 = s9 = s10 = s11 = s12 = s13 = s14 = s15 = s16 = s17 = s18 = s19 = s20 =
                s21 = s22=s23=s24=s25=s26=s27=s28=s29=s30=s31=s32=s33=s34=s35=s36=s37 = s38 = s39 = s40 =
                s41=s42=s43=s44=s45=s46=s47=s48=s49=s50=s51=s52=s53=s54=s55=s56=s57=s58=s59=s60=
                s61=s62=s63=s64=s65=s66=s67=s68=s69=s70=s71=s72=s73=s74=s75=s76=s77=s78=s79=s80=
                s81=s82=s83=s84=s85=s86=s87=s88=s89=s90=s91=s92=s93=s94=s95=s96=s97=s98=s99=s100 = 0;
    }

    public static void main(String[] args) {
        try {
           test();
        } catch (Throwable e) {
            System.out.println("stack length:" + stackLength);
            e.printStackTrace();
        }
    }
}
