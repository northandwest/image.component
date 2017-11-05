package image.component;

import org.junit.Test;

import com.bucuoa.component.image.ImageRemarkUtil;

public class TestMark {

	@Test
	public void test()
	{
        String srcImgPath = "e:/temp/a.png";
        String logoText = "此业务不用于任何业务办理";

        String targerTextPath = "e:/temp/qie_text.png";
        String targerTextPath2 = "e:/temp/qie_text_rotate.png";
        
        long start = System.currentTimeMillis();
        System.out.println("给图片添加水印文字开始...");
        // 给图片添加水印文字
        ImageRemarkUtil.markImageByText(logoText, srcImgPath, targerTextPath);
        long end = System.currentTimeMillis();
        // 给图片添加水印文字,水印文字旋转-45
//        ImageRemarkUtil.markImageByText(logoText, srcImgPath, targerTextPath2, -45);
//        long end1 = System.currentTimeMillis();
        System.out.println("给图片添加水印文字结束..."+(end-start)+"ms");

//        String iconPath = "d:/2.jpg";

//        String targerIconPath = "d:/qie_icon.jpg";
//        String targerIconPath2 = "d:/qie_icon_rotate.jpg";
//        System.out.println("给图片添加水印图片开始...");
//        ImageRemarkUtil.setImageMarkOptions(0.3f, 1, 1, null, null);
//        // 给图片添加水印图片
//        ImageRemarkUtil.markImageByIcon(iconPath, srcImgPath, targerIconPath);
//        // 给图片添加水印图片,水印图片旋转-45
//        ImageRemarkUtil.markImageByIcon(iconPath, srcImgPath, targerIconPath2, -45);
//        System.out.println("给图片添加水印图片结束...");
	}
}
