package org.my.heart.utils;

import java.util.UUID;

/**
 * 工具类
 * 
 * @author 彭嘉辉
 *
 */
public class CommonUtils {

	/**
	 * 生成全局唯一id
	 * @return
	 */
	public static long generateId() {
		int hashCode = UUID.randomUUID().toString().hashCode();
		return (hashCode < 0 ? -hashCode : hashCode) + System.currentTimeMillis();
	}
}
