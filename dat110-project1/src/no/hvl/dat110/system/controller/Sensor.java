package no.hvl.dat110.system.controller;

import java.net.Socket;

import no.hvl.dat110.rpc.*;

public class Sensor extends RPCStub {

	private byte RPCID = 1;
	
	public int read() {
		
		int temp;
		
		// TODO
		// implement marshalling, call and unmarshalling for read RPC method		

		RPCClient client;
		byte[] b;
		
		client = new RPCClient(Common.SENSORHOST, Common.SENSORPORT);
		RPCServer server = new RPCServer(Common.SENSORPORT);
		
		
		
		return temp;
	}
	
}
