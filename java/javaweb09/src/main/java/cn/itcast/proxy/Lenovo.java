package cn.itcast.proxy;

/**
 * @projectName: javaweb09
 * @package: cn.itcast.proxy
 * @className: Lenovo
 * @NAME: WANG CHAO
 * @date: 2023/08/18 14:13
 */
@SuppressWarnings({"all"})
public class Lenovo implements SaleComputer{
    @Override
    public String sale(double money) {
        System.out.println("花了"+ money +"元买了一台联想电脑...");
        return "联想电脑";
    }

    @Override
    public void show() {
        System.out.println("展示电脑...");
    }
}
