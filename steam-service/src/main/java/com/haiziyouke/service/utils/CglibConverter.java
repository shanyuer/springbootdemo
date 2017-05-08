package com.haiziyouke.service.utils;

import com.alibaba.fastjson.JSONArray;
import net.sf.cglib.core.Converter;

import java.util.Date;

/**
 * Cglib转换器，针对Cglib不能转换的类型手动处理
 *
 * @author Seer
 * @version CglibConverter.java, v 0.1 2015年11月18日 下午2:02:24 Seer Exp.
 */
public class CglibConverter implements Converter {

	/** true为Y */
	public static final String BOOLEAN_TRUE = "Y";

	/** false为N */
	public static final String BOOLEAN_FALSE = "N";

	/**
	 * @see Converter#convert(Object,
	 *      Class, Object)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object convert(Object value, Class target, Object context) {
		if (value == null) {
			return null;
		}
		Class targetClass = target;
		// 日期 Date --> String
		if (Date.class.isInstance(value) && targetClass.isAssignableFrom(String.class)) {
			return DateUtils.getDefaultDate((Date) value);
		}

		// 日期 Date --> long
		if (Date.class.isInstance(value) && targetClass.isAssignableFrom(long.class)) {
			return ((Date) value).getTime();
		}

		// boolean --> String
		if (Boolean.class.isInstance(value) && targetClass.isAssignableFrom(String.class)) {
			return ((Boolean) value == true) ? BOOLEAN_TRUE : BOOLEAN_FALSE;
		}

		// String --> boolean
		if (String.class.isInstance(value)
			&& (targetClass.isAssignableFrom(Boolean.TYPE) || targetClass.isAssignableFrom(Boolean.class))) {
			return ((String) value).equals(BOOLEAN_TRUE) ? true : false;
		}
		// String --> JSONArray
		if (String.class.isInstance(value) && targetClass.isAssignableFrom(JSONArray.class)) {
			return JSONArray.parse((String) value);
		}
		return value;
	}
}
