package org.my.heart.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.my.heart.constants.ContentType;
import org.my.heart.entity.Result;

/**
 * 响应工具类
 * 
 * @author 彭嘉辉
 *
 */
public class ResponseUtils {

	/**
	 * 返回响应信息
	 * 
	 * @param response
	 * @param result
	 * @throws IOException
	 */
	public static void buildResponseBody(HttpServletResponse response, Result result) throws IOException {
		response.setStatus(200);
		response.setContentType(ContentType.APPLICATION_JSON_UTF8);
		response.getWriter().write(result.toJSONString());
	}
}
