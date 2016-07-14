package cui.string;

public class Erweima {
	public static String createQrcode(String _text){
	    String qrcodeFilePath = "";
	    try {
	        int qrcodeWidth = 300;
	        int qrcodeHeight = 300;
	        String qrcodeFormat = "png";
	        HashMap<EncodeHintType, String> hints = new HashMap<EncodeHintType, String>();
	        hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
	        BitMatrix bitMatrix = new MultiFormatWriter().encode('http://www.cnblogs.com/java-class/', BarcodeFormat.QR_CODE, qrcodeWidth, qrcodeHeight, hints);

	        BufferedImage image = new BufferedImage(qrcodeWidth, qrcodeHeight, BufferedImage.TYPE_INT_RGB);
	        JVMRandom random = new JVMRandom();
	        File QrcodeFile = new File("F:\\qrcode\\" + random.nextInt() + "." + qrcodeFormat);
	        ImageIO.write(image, qrcodeFormat, QrcodeFile);
	        MatrixToImageWriter.writeToFile(bitMatrix, qrcodeFormat, QrcodeFile);
	        qrcodeFilePath = QrcodeFile.getAbsolutePath();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return qrcodeFilePath;
	}

}
