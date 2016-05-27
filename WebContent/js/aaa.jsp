<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link rel=stylesheet type=text/css href="css/css.css" media=all>
<SCRIPT type=text/javascript src="js/xixi.js"></SCRIPT>
<SCRIPT type=text/javascript src="js/jquery.tooltip.pack.js"></SCRIPT>
<SCRIPT type=text/javascript src="js/player.js"></SCRIPT>
<SCRIPT type=text/javascript>
$(document).ready(function() {
  slideshow_data["1"] = new views_slideshow_data(10, 5000, 1, true, "fast", 0.25);
  views_slideshow_timer("1", true);
  $("#views_slideshow_main_1").hover(
    function() {
      views_slideshow_pause("1");
    },
    function() {
      views_slideshow_resume("1");
    });
});
</SCRIPT>
</head>
<BODY class="front" style="text-align:center">
<br />
<br />
<DIV id=wrapper>
  <DIV id=container>
    <DIV id=introBoxes>
      <DIV id=introWelcome class=introPart><a href="http://www.mobanwang.com/" target="_blank"><img src="images/01.jpg" width="970" height="287" border="0" /></a></DIV>
      <DIV id=introAccessibility class=introPart><a href="http://www.mobanwang.com/" target="_blank"><img src="images/02.jpg" width="970" height="287" /></a></DIV>
      <DIV id=introPerformance class=introPart><a href="http://www.mobanwang.com/" target="_blank"><img src="images/03.jpg" width="970" height="287" /></a></DIV>
      <DIV id=introFeatured class=introPart><a href="http://www.mobanwang.com/" target="_blank"><img src="images/04.jpg" width="970" height="287" /></a></DIV>
      <DIV id=introCommunity class=introPart><a href="http://www.mobanwang.com/" target="_blank"><img src="images/05.jpg" width="970" height="287" /></a></DIV>
    </DIV>
    <!--introBoxes-->
    <DIV id=introNav>
      <UL id=playback>
        <LI class=prev><A href="#">Previous</A></LI>
        <LI class=play><A href="#">Play</A> </LI>
        <LI class=pause><A href="#">Pause</A></LI>
        <LI class=next><A href="#">Next</A> </LI>
      </UL>
      <DIV id=timeline>
        <DIV class=inside></DIV>
      </DIV>
      <UL class=nav>
        <LI class="p1 active"><A href="#">甜点图片<SPAN class="point p1"></SPAN></A></LI>
        <LI class=p2><A href="#">小食图片<SPAN 
  class="point p2"></SPAN></A></LI>
        <LI class=p3><A href="#"> 香辣图片 <SPAN 
  class="point p3"></SPAN></A></LI>
        <LI class=p4><A href="#"> 精美食品图片 <SPAN 
  class="point p4"></SPAN></A></LI>
        <LI class=p5><A href="#">  流口水图片<SPAN 
  class="point p5"></SPAN></A></LI>
      </UL>
    </DIV>
    <!--introNav-->
  </DIV>
  <!--container-->
</DIV>
<!--wrapper-->
<div style="width:550px;margin:20px auto;">


</div>
<div align="center">(1)诱人的大蕉 (2)巴拿马素鸡饭 (3)法式香排 (4)美式黑胡椒素牛排 <br>
(5)义大利松子面 (6)基本义大利沙拉汁 (7)面包沙拉 (8)奶油南瓜汤 <br>
(9)好吃的马铃薯泥 (10)蔓越莓柳橙沙拉 (11)蕃茄素虾义大利面 (12)八种素食沙拉酱<br> 
(13)十全十美生菜沙拉 (14)巴西利沙拉 (15)六种沙拉酱 (16)全麦三明治 <br>
(17)薄片苹果派 (18)印度炸薄饼 (19)印度豆泥 (20)印度香味蔬菜 <br>
(21)法式开胃西芹 (22)咖哩绉纱饼 (23)希腊沙拉 (24)希腊镶彩椒 <br>
(25)花生酱、芝麻酱 (26)炸吉蔓越莓沙拉 (27)川七义大利面 (28)焗菠菜通心面 <br>
(29)三种沙拉 (30)法式鲜蔬 (31)埃及豆泥沾酱 (32)彩色沙拉 <br>
(33)莱茵草莓派 (34)印度脆饼 (35)瑞士卷 (36)义大利茄汁面疙瘩 <br>
(37)凤梨蕃茄酱 (38)德国斋 (39)简易比萨 (40)豆腐汉堡 <br>
(41)开胃菜 (42)花椰奶香 (43)情人沙拉酱 (44)焗烤马铃薯 <br>
(45)感恩大餐 (46)自制意大利面酱 (47)瑞士巧克力青蔬 (48)印尼马铃薯春卷 <br>
(49)墨西哥蔬菜汤 (50)墨西哥玉米薄饼 (51)维也纳式音乐早餐 (52)义大利式香焗豆腐<br> 
(53)瑞典百香沙拉 (54)阿拉伯麻酱吉丝 (55)美式黑胡椒素牛排 (56)纽西兰式黄金奶酪 <br>
(57)美式苹果香玉米 (58)苏格兰桂花香豆腐 (59)夏威夷式酥烤凤梨 (60)加拿大枫香蜜月</div>
<div align="center"><h1><a href="http://localhost:8080/dingcan/main.jsp">返回</a></h1></div>
</body>
</html>