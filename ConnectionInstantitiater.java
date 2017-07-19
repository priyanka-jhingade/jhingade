package com.java.JDBCCodeTest.datasource;

public class ConnectionInstantitiater {
	private static ConnectionDetail connectionDetail=null;
	public ConnectionInstantitiater() {	
		if(connectionDetail!=null){
			throw new IllegalStateException("instance already created!");
		}
	}
	
	
	public static ConnectionDetail getConnectionInstance(){
		if(connectionDetail==null){
			synchronized (ConnectionDetail.class) {
				if(connectionDetail==null){
					connectionDetail=new ConnectionDetail();
				}
			}
		}
		return connectionDetail;
	}
	
	protected Object readResolver(){
		return getConnectionInstance();
	}
	
	
	
}
