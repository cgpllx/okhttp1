package com.konka.text;

import java.io.IOException;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class text {
	public static void main(String[] args) throws IOException {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url("http://www.baidu.com").build();
		Request request1 = new Request.Builder().url("http://www.konka.com").build();

		System.out.println("111111");
//		client.newCall(request).enqueue(new Callback() {
//
//			@Override
//			public void onFailure(Request request, IOException e) {
//				System.out.println(request);
//			}
//
//			@Override
//			public void onResponse(Response response) throws IOException {
//				System.out.println(response.body().toString());
//				// response.cacheControl()
//			}
//		});
		final Call c=client.newCall(request1);c.enqueue(new Callback() {
			
			@Override
			public void onFailure(Request request, IOException e) {
				System.out.println(request);
			}
			
			@Override
			public void onResponse(Response response) throws IOException {
				System.out.println(response.body().toString());
				// response.cacheControl()
//			c.cancel();
			}
		});
		System.out.println("111111");
		// String s=response.body().string();
		System.out.println("111111");
		// System.out.println(s);
		System.out.println("111111");
//		System.out.println(response.body().string());
	}
}
