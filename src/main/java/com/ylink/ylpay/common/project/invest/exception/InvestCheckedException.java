/**
 * 版权所有(C) 2012 深圳市雁联计算系统有限公司-证联融通电子有限公司
 * 创建:YG.HU 2012-12-20
 */

package com.ylink.ylpay.common.project.invest.exception;

import com.ylink.ylpay.common.core.exception.CodeCheckedException;

/** 
 * @author YG.HU
 * @date 2012-12-20
 * @description：TODO
 */

public class InvestCheckedException extends CodeCheckedException {
    private static final long serialVersionUID = 1L;
    
    public InvestCheckedException() {
        super();
    }

    public InvestCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvestCheckedException(String message) {
        super(message);
    }
    
    public InvestCheckedException(String code, String message) {
        super(code, message);
    }

    public InvestCheckedException(Throwable cause) {
        super(cause);
    }
}
