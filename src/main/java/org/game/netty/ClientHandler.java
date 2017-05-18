/**
 * 
 */
package org.game.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 说明：处理器
 */
public class ClientHandler extends
		SimpleChannelInboundHandler<Object> {

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object obj)
			throws Exception {
		System.out.println(obj);
		/*if (obj instanceof JacksonBean) {
			JacksonBean user = (JacksonBean) obj;
			
			jsonString = JacksonMapper.getInstance().writeValueAsString(user); // 对象转为json字符串
		} else {
			jsonString = JacksonMapper.getInstance().writeValueAsString(obj); // 对象转为json字符串
		}
		System.out.println("Client get msg form Server -" + jsonString);*/
	}

}
