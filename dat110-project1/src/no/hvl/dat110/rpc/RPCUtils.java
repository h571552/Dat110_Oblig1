package no.hvl.dat110.rpc;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

//import sun.reflect.generics.tree.IntSignature;

public class RPCUtils {

	public static byte[] marshallString(byte rpcid, String str) {

		// TODO: marshall RPC identifier and string into byte array
		
		byte[] b = str.getBytes();
		
		byte[] encoded = new byte[b.length+1];
		encoded[0] = rpcid;
		
		for(int i = 1; i < b.length+1; i++) {
			encoded[i] = b[i-1];
		}

		return encoded;
	}

	public static String unmarshallString(byte[] data) {

		String decoded = new String(data, 1, data.length-1);

		// TODO: unmarshall String contained in data into decoded
		
		return decoded;
	}

	public static byte[] marshallVoid(byte rpcid) {

		byte[] encoded = new byte[1];
		encoded[0] = rpcid;

		// TODO: marshall RPC identifier in case of void type

		

		return encoded;

	}

	public static void unmarshallVoid(byte[] data) {

		// TODO: unmarshall void type
	}

	public static byte[] marshallBoolean(byte rpcid, boolean b) {

		byte[] encoded = new byte[2];

		encoded[0] = rpcid;

		if (b) {
			encoded[1] = 1;
		} else {
			encoded[1] = 0;
		}

		return encoded;
	}

	public static boolean unmarshallBoolean(byte[] data) {

		return (data[1] > 0);

	}

	public static byte[] marshallInteger(byte rpcid, int x) {

		byte[] encoded = new byte[5];


		
		// TODO: marshall RPC identifier and string into byte array

		encoded[0] = rpcid;
		
		byte[] b = ByteBuffer.allocate(4).putInt(x).array();

		for(int i = 1; i < b.length+1; i++) {
			encoded[i] = b[i-1];
		}
		
		return encoded;
	}

	public static int unmarshallInteger(byte[] data) {

		// TODO: unmarshall integer contained in data
		
		byte b[] = new byte[data.length-1];
		
		for(int i = 1; i < data.length; i++) {
			b[i-1] = data[i];
		}
		
		int decoded = ByteBuffer.wrap(b).getInt();
		
		return decoded;

	}
}
