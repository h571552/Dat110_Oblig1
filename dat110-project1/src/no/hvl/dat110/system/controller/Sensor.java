package no.hvl.dat110.system.controller;

import java.net.Socket;

import no.hvl.dat110.rpc.*;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {
		
		int temp;
		
		// TODO
		// implement marshalling, call and unmarshalling for read RPC method		

		
		byte[] b = RPCUtils.marshallVoid(RPCID);
		
		byte[] bytes = rmiclient.call(b);
		
		temp = RPCUtils.unmarshallInteger(bytes);
		
		return temp;
	}
	
}
