package image.component;

import java.awt.Color;
import java.awt.Font;

import org.junit.Test;

import com.bucuoa.component.image.ImageUtils;

public class TestImageUtils {
	@Test
	public void test()
	{
		  String srcImgPath = "e:/temp/b.jpg";
	        String logoText = "此业务不用于任何业务办理";

	        String targerTextPath = "e:/temp/qie_text2.png";
	        String targerTextPath2 = "e:/temp/qie_text_rotate.png";
	        long start = System.currentTimeMillis();
	        System.out.println("给图片添加水印文字开始...");
	        // 给图片添加水印文字
	        ImageUtils.pressText(srcImgPath,targerTextPath, logoText, "宋体", Font.BOLD | Font.ITALIC, 80, Color.red, -140, -140, 0.8f);
//	        ImageUtils.pressText(srcImgPath, logoText, "宋体", Font.BOLD | Font.ITALIC, 80, Color.red, -140, -140, 0.8f);

	        long end = System.currentTimeMillis();
	        // 给图片添加水印文字,水印文字旋转-45
//	        ImageRemarkUtil.markImageByText(logoText, srcImgPath, targerTextPath2, -45);
//	        long end1 = System.currentTimeMillis();
	        System.out.println("给图片添加水印文字结束..."+(end-start)+"ms");
//	        ImageUtils.pressImage("C://pic//jpg", "C://pic//test.gif", 5000, 5000, 0f);
//	        ImageUtils.resize("C://pic//4.jpg", 1000, 500, true);
			
	}
}
