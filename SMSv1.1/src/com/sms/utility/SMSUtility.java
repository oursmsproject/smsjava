package com.sms.utility;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.converters.LongConverter;

public final class SMSUtility {

	public static <T> T convert(Object source, Class<T> targetType)
	        throws InstantiationException,
	        IllegalAccessException,
	        InvocationTargetException {
	    if (source == null)
	        return null;
	    T target = targetType.newInstance();
	    LongConverter converter = new LongConverter(null); 
	    BeanUtilsBean beanUtilsBean = new BeanUtilsBean();
	    beanUtilsBean.getConvertUtils().register(converter, Long.class);
	    beanUtilsBean.copyProperties(target, source);
	    return target;
	}
	
}
