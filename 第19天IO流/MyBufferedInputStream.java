import java.io.*;

class MyBufferedInputStream 
{private InputStream in;
		
		private byte[] buf = new byte[1024*4];

		private int pos = 0, count =0;
	
		
		MyBufferedInputStream(InputStream in)
		{
			this.in = in;
		}

		//һ�ζ�һ���ֽڣ��ӻ�����(�ֽ�����)��ȡ��
		public int myRead()throws IOException
		{
			//ͨ��in�����ȡӲ�������ݣ����洢buf�С�
			if(count==0)
			{
				count = in.read(buf);
				if(count<0)
					return -1;
				pos = 0;
				byte b = buf[pos];

				count--;
				pos++;
				return b&255;
			}
			else if(count>0)
			{
				byte b = buf[pos];

				count--;
				pos++;
				return b&0xff;
			}
			return -1;
		}
	public void myClose() throws IOException
	{
		in.close();
	}

/*
1111111111111 00000001111111111111000001111111111000

byte:-1  ---> int : -1;
 00000000 00000000 00000000 0000000	255
 11111111 11111111 11111111 1111111

 11111111  -->������һ��int���� ������-1�� ��-1��ԭ������Ϊ��8��1ǰ�油����1���µġ�
 ��ôֻҪ��ǰ�油0�������Ա���ԭ�ֽ����ݲ��䣬�ֿ��Ա���-1�ĳ��֡�
 ��ôʵ�ֲ�0��


 11111111 11111111 11111111 11111111
&00000000 00000000 00000000 00000000
------------------------------------
 00000000 00000000 00000000 11111111


*/
}
