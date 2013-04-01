package me.xiaopan.androidlibrary.net;

import org.json.JSONObject;

/**
 * 响应处理器接口
 * @author xiaopan
 *
 */
public interface ResponseHandler {
	/**
	 * 当需要判断访问是否成功，如果成功，接下来会调用onGetSuccessResult()获取成功结果，否则调用onGetFailStateCode()获取失败状态码
	 * @param responseJsonObject
	 * @return 是否成功
	 * @throws Exception 
	 */
	public boolean onIsSuccess(JSONObject responseJsonObject) throws Exception;

	/**
	 * 当需要获取成功结果
	 * @param responseJsonObject
	 * @return 成功结果
	 * @throws Exception 
	 */
	public Object onGetSuccessResult(JSONObject responseJsonObject) throws Exception;

	/**
	 * 当需要获取错误信息
	 * @param responseJsonObject
	 * @return 错误信息
	 * @throws Exception 
	 */
	public ErrorInfo onGetErrorInfo(JSONObject responseJsonObject) throws Exception;
}