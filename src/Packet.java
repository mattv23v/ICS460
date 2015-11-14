/**
 * Created by Matt on 11/11/2015.
 */
public class Packet {
    int ackno;	                  //32-bit 4-byte
    int seqno ; 	             //32-bit 4-byte Data packet Only
    byte data[];                  //0-500 bytes. Data packet only. Variable
      Packet(int ackno, int seqno, byte[] data){
          this.ackno=ackno;
          this.seqno=seqno;
          this.data=data;
      }

}
