package com.mode.mode3.deepclone;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hongde
 * @version 1.0.0
 * @Description TODO
 * @ClassName DeepCloneableTarget.java
 * @createTime 2021-07-14 14:38:00
 */
@AllArgsConstructor
@NoArgsConstructor
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    /**
     * 因为该类的属性，都是String , 因此我们这里使用默认的clone完成即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
