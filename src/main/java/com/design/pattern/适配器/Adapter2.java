package com.design.pattern.适配器;

/*******************************************************************************
 *
 * @date 2018-10-16 上午 11:25 
 * @author: <a href=mailto:huangyr>黄跃然</a>
 * @Description: 继承
 ******************************************************************************/
public class Adapter2 extends Adaptee {

    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    public void sampleOperation1() {
        this.sampleOperation1();
    }

    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此由适配器类需要补充此方法
     */
    public void sampleOperation2() {
        //写相关的代码
    }

}
