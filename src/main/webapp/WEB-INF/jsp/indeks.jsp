<%-- 
    Document   : indeks
    Created on : Oct 19, 2016, 11:08:20 PM
    Author     : Sofrie
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Shop Around</title>
    <style type="text/css">
        * { padding:0; margin:0; outline:0; }
        body {
                background:#fff url(images/body.gif) repeat-x 0 0;
                font-family: "Trebuchet MS", Arial, sans-serif;
                font-size:12px;
                line-height:16px;
                color:#636363;
        }
        input, textarea, select { font-family: "Trebuchet MS", Arial, sans-serif; font-size:12px; }

        .field { background:#ebebeb; border:solid 1px #dedede; padding:2px;}

        a img { border:0; }

        a { color:#8b0000; text-decoration: underline; cursor:pointer; }
        a:hover { color:#666; text-decoration: none; }

        .left, .alignleft { float:left; display:inline; }
        .right, .alignright { float:right; display:inline; }

        .cl { font-size:0; line-height:0; clear:both; display:block; height:0; }

        .al { text-align: left; }
        .ar { text-align: right; }
        .ac { text-align: center; }

        h2 { font-size:14px; line-height:16px; }
        h3 { font-size:12px; line-height:14px; text-transform: uppercase; color:#000; }
        h4 { font-size:12px; line-height:14px; text-transform: uppercase; color:#000; }


        h1#logo { font-size:0; line-height:0; width:156px; height:64px; float:left; }
        h1#logo a{ display:block; height:64px; text-indent: -4000px; background:url(images/logo.gif); }

        .shell { width:960px; margin:0 auto; padding:10px; background:#fff; }

        #header { height:64px; background:url(images/header.gif); position:relative;}

        #navigation { float:right; white-space:nowrap; }
        #navigation ul{ list-style-type: none; height:64px; font-weight: bold; float:left;}
        #navigation ul li{ float:left; display:inline; }
        #navigation ul li a{ float:left; height:64px; line-height:64px; text-decoration: none; color:#fff; padding:0 15px;}
        #navigation ul li a.active,
        #navigation ul li a:hover{ background:#fff; color:#8b0000; }

        #cart { float:right; width:160px; top:0; right:0; height:51px; background:#8b0000; color:#fff; padding:13px 10px 0 10px; white-space:nowrap; line-height:20px;}
        a.cart-link { color:#fff; background:url(images/cart-link.gif) no-repeat 0 0; padding:0 0 0 32px; text-decoration: none;}
        a.cart-link:hover { text-decoration: underline;}

        #sidebar { float:left; width:226px;}
        #content { float:right; width:724px;}

        #main { padding:10px 0 0 0; }

        .box { padding:1px; border:solid 1px #dedede; margin-bottom:10px;}
        .box h2{ background:#7f7f7f; color:#fff; font-weight: normal; padding:0 5px; position:relative; height:27px; line-height:27px; }
        .box h2 span{ position:absolute; width:10px; height:5px; background:url(images/h2-arr.gif); top:27px; right:10px; font-size:0; line-height:0;}
        .box-content { padding:5px;}

        a.bul { background:url(images/bul.gif) no-repeat 0 center; padding-left:10px;}

        .search { min-height:252px;}
        .search label { display:block; padding-bottom:3px; }

        .search .field { display:block; margin-bottom:10px; }
        .search .inline-field label { display:inline; padding:0; }
        .search .inline-field .field { display:inline; margin:0; }
        .search input.field { width:206px; }
        .search select.field { width:212px; }
        .search select.small-field { width:50px; }

        .search-submit { width:70px; background:#8b0000; border:0; color:#fff; height:27px; display:block; line-height:26px; cursor:pointer; margin:12px 0 10px 0;}

        .categories { min-height:383px; }
        .categories ul { list-style-type: none; font-size:13px;}
        .categories ul li{ border-bottom:dashed 1px #ccc; padding:5px 0;}
        .categories ul li.last{ border-bottom:0; padding-bottom:0;}
        .categories ul li a{ color:#5f5f5f; text-decoration: none; background:url(images/cat.gif) no-repeat 0 4px; padding-left:17px;}
        .categories ul li a:hover{ color:#8b0000; }

        #slider { height:252px; position:relative; overflow:hidden; }
        #slider-holder { width:720px; height:252px; position:relative; overflow:hidden; }
        #slider-holder .jcarousel-clip{ width:720px; height:252px; position:relative; overflow:hidden; }
        #slider-holder ul{ width:720px; height:252px; position:relative; overflow:hidden; list-style-type: none;}
        #slider-holder ul li{ width:720px; height:252px; position:relative; overflow:hidden; float:left; }

        #slider-nav { position:absolute; top:231px; left:644px; z-index:2;}
        #slider-nav a{ font-size:0; line-height:0; text-indent: -4000px; width:10px; height:10px; border:solid 1px #8b0000; background:#8b0000; float:left; margin-right:5px; }
        #slider-nav a:hover,
        #slider-nav a.active { background:#fff;}

        .products {}
        .products ul{ list-style-type: none;}
        .products ul li{ position:relative; padding:1px; border:solid 1px #dedede; float:left; width:231px; margin-right:9px; height:383px; overflow:hidden; }
        .products ul li.last{ margin-right:0; }

        .product-info{ position:absolute; width:153px; top:250px; left:0;}
        .product-info h3{ background:#8b0000; color:#fff; padding:6px 10px; }
        .product-info h4{ font-weight: normal;}
        .product-info p{ font-size:16px; line-height:18px; text-transform: uppercase; font-weight: bold; color:#000; padding:5px 0 7px 0;}
        .product-info .product-desc{ padding:10px; background:url(images/info.png); width:133px; }

        .price { display:block; font-size:21px; color:#8b0000; line-height:23px; }

        .more-products { border:solid 1px #dedede; position:relative; height:114px; overflow:hidden; }
        .more-products ul{ list-style-type: none; height:94px; position:relative; overflow:hidden; width:805px;}
        .more-products ul li{ float:left; width:94px; height:94px; border-right:dashed 1px #ccc; padding:0 10px;}
        .more-products ul li.last{ border-right:0; }

        .more-products-holder { width:804px; height:94px; position:relative; overflow:hidden; top:10px; left:70px;}
        .more-products-holder .jcarousel-clip{ width:804px; height:94px; position:relative; overflow:hidden; }

        .more-nav { font-size:0; line-height:0;}
        .more-nav a{ position:absolute; top:40px; left:0; width:30px; height:32px; text-indent: -4000px; z-index:3;}
        .more-nav a.next{ background:url(images/next.gif); left:910px;}
        .more-nav a.prev{ background:url(images/prev.gif); left:20px;}

        .cols { padding:15px 0;}
        .col { float:left; display:inline; width:217px; margin-right:30px;}
        .col-last { margin-right:0;}

        h3.ico { background-repeat:no-repeat; background-position:0 2px; padding:6px 0 8px 30px;}
        h3.ico1 { background-image:url(images/ico1.gif);}
        h3.ico2 { background-image:url(images/ico2.gif);}
        h3.ico3 { background-image:url(images/ico3.gif);}
        h3.ico4 { background-image:url(images/ico4.gif);}

        #footer { height:51px; background:#ebebeb; white-space:nowrap; line-height:50px; padding:0 15px; color:#7b7b7b; margin-top:10px;}
        #footer a{ color:#7b7b7b; text-decoration: none;}
        #footer a:hover{ color:#000;}
        #footer span{ padding:0 2px;}
    </style>
<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<!--[if lte IE 6]><link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" /><![endif]-->
<script src="js/jquery-1.4.1.min.js" type="text/javascript"></script>
<script src="js/jquery.jcarousel.pack.js" type="text/javascript"></script>
<script src="js/jquery-func.js" type="text/javascript"></script>
</head>
<body>
<!-- Shell -->
<div class="shell">
  <!-- Header -->
  <div id="header">
      
    <h1 id="logo">
        <img src="https://orangephotography.com/wp-content/uploads/2015/04/orange_logo_1c.png" alt="" style='height: 100%; width: 100%; object-fit: contain' />
        
    </h1>
    <!-- Cart -->
    <c:set var="val" scope="session" value="${cantik}"/>
    <c:choose> 
        <c:when test="${fn:length(val) < 1}">
            <div id="cart"> <a href="login" class="cart-link">Your Wishlist</a>
        </c:when>
        <c:otherwise>
            <div id="cart"> <a href="userWishlist/${user}" class="cart-link">Your Wishlist</a>
        </c:otherwise>
    </c:choose>     
    
      
    </div>
    <!-- End Cart -->
    <!-- Navigation -->
    
    <div id="navigation" >
        
      <ul>
        <li><a href="#" class="active">Home</a></li>
        <li><a href="#" class="active">Support</a></li>
        <li><a href="#" class="active">My Account</a></li>
        <li><a href="#" class="active">The Store</a></li>
        <li><a href="#" class="active">Contact</a></li>
      </ul>
    
    <!-- End Navigation -->
    </div>
</div>
    <div id="buttonLogin">  
        
        <c:set var="val" scope="session" value="${cantik}"/>
        <c:choose> 
            <c:when test="${fn:length(val) < 1}">
                <a href="${pageContext.request.contextPath}/login">Login</a> </br>
            </c:when>
            <c:otherwise>
                <a href="${pageContext.request.contextPath}/logout">Logout</a> 
            </c:otherwise>
        </c:choose>     
        
    </div>
  <!-- End Header -->
  <!-- Main -->
  <div id="main">
    <div class="cl">&nbsp;</div>
    <!-- Content -->
    <div id="content">
      <!-- Content Slider -->
      <div id="slider" class="box">
        <div id="slider-holder">
            
          <ul>
            <li><a href="#"><img src="http://s.kaskus.id/r540x540/images/2014/07/25/4126638_20140725104936.jpg" alt="" style='height: 100%; width: 100%; object-fit: contain' /></a></li>
            <li><a href="#"><img src="css/images/slide1.jpg" alt="" /></a></li>
            <li><a href="#"><img src="css/images/slide1.jpg" alt="" /></a></li>
            <li><a href="#"><img src="css/images/slide1.jpg" alt="" /></a></li>
          </ul>
        </div>
        <div id="slider-nav"> <a href="#" class="active">1</a> <a href="#">2</a> <a href="#">3</a> <a href="#">4</a> </div>
      </div>
      <!-- End Content Slider -->
      <!-- Products -->
      <div class="products">
        <div class="cl">&nbsp;</div>
        <ul>
            <li> <a href="#"><img src="http://id-live-03.slatic.net/p/hequ-short-sleeve-starry-pour-milk-pattern-short-sleeve-breathable-cotton-t-shirt-hitam-8513-6598486-871390b218be6e4519f42dd578a55b16-catalog_233.jpg" alt="" style='height: 100%; width: 100%; object-fit: contain' /></a>
            <div class="product-info">
               
                <form:form modelAttribute="wishlist" action="${pageContext.request.contextPath}/tambahwishlist" method="post">
                   
                    
                    <div class="product-desc">
                        <p>Kaos Hitam Ganteng</p>
                        <strong class="price">Rp.200.000</strong> </div>
                       
                        <a href="#">Add to Cart</a>
                        <c:set var="idbarang1" scope="session" value="${1}"/>
                        <c:set var="iduser" scope="session" value="${user}"/>
                        <c:set var="namabarang" scope="session" value="Kaos"/> 	
                        <c:choose> 
                            <c:when test="${fn:length(val) < 1}">
                                <a href="${pageContext.request.contextPath}/login">Add to Wishlist</a> </br
                            </c:when>
                            <c:otherwise>
                                <a href="${pageContext.request.contextPath}/addWishlist/${idbarang1}/${iduser}">Add to Wishlist</a>
                            </c:otherwise>
                        </c:choose>  
                            
                </form:form>              
            </div>
            </li>
            <li> <a href="#"><img src="http://s.kaskus.id/r540x540/images/2014/07/25/4126638_20140725104936.jpg" alt="" style='height: 100%; width: 100%; object-fit: contain' /></a>
                <div class="product-info">
                    
                    <div class="product-desc">
                    
                    <p>Boneka tsum tsum</p>
                    <strong class="price">Rp.50.000</strong> </div>
                    <a href="#">Add to Cart</a>
                        <c:set var="idbarang2" scope="session" value="${2}"/>
                        <c:set var="iduser" scope="session" value="${user}"/>
                        <c:set var="namabarang" scope="session" value="Kaos"/> 	
                        <c:choose> 
                            <c:when test="${fn:length(val) < 1}">
                                <a href="${pageContext.request.contextPath}/login">Add to Wishlist</a> </br
                            </c:when>
                            <c:otherwise>
                                <a href="${pageContext.request.contextPath}/addWishlist/${idbarang2}/${iduser}">Add to Wishlist</a>
                            </c:otherwise>
                        </c:choose>                                  
                </div>
              </li>
              <li class="last"> <a href="#"><img src="http://g04.s.alicdn.com/kf/HTB1hjnsHVXXXXbWXpXXq6xXFXXXR/high-quality-design-Cute-Tsum-Tsum-Pluto.jpg" alt="" style='height: 100%; width: 100%; object-fit: contain' /></a>
                <div class="product-info">
                  
                  <div class="product-desc">
                    
                    <p>Tsum tsum Pluto</p>
                    <strong class="price">Rp.55.000</strong> </div>
                    <a href="#">Add to Cart</a>
                        <c:set var="idbarang3" scope="session" value="${3}"/>
                        <c:set var="iduser" scope="session" value="${user}"/>
                        <c:set var="namabarang" scope="session" value="Kaos"/> 	
                        <c:choose> 
                            <c:when test="${fn:length(val) < 1}">
                                <a href="${pageContext.request.contextPath}/login">Add to Wishlist</a> </br
                            </c:when>
                            <c:otherwise>
                                <a href="${pageContext.request.contextPath}/addWishlist/${idbarang3}/${iduser}">Add to Wishlist</a>
                            </c:otherwise>
                        </c:choose>  
                    
                </div>
              </li>
            </ul>
            <div class="cl">&nbsp;</div>
          </div>
      <!-- End Products -->
    </div>
    <!-- End Content -->
    <!-- Sidebar -->
    <div id="sidebar">
      <!-- Search -->
      <div class="box search">
        <h2>Search by <span></span></h2>
        <div class="box-content">
          <form action="#" method="post">
            <label>Keyword</label>
            <input type="text" class="field" />
            <!-- Buat nampilin pilihan kategori -->
            <label>Category</label>
            <select class="field" name="kategoriList">
                <c:forEach items="${kategoris}" var="kategori">
                    <option value="${kategori.idkategori}">${kategori.namakategori}
                    </option>
                </c:forEach>
            </select>
            
            <div class="inline-field">
              <label>Price</label>
              <select class="field small-field">
                <option value="">$10</option>
              </select>
              <label>to:</label>
              <select class="field small-field">
                <option value="">$50</option>
              </select>
            </div>
            <input type="submit" class="search-submit" value="Search" />
            <p> <a href="#" class="bul">Advanced search</a><br />
              <a href="#" class="bul">Contact Customer Support</a> </p>
          </form>
        </div>
      </div>
      <!-- End Search -->
      <!-- Categories -->
      <div class="box categories">
        <h2>Categories <span></span></h2>
        <div class="box-content">
          <ul>              
            <!--<li><a href="#">Pakaian</a></li>
            <li><a href="#">Elektronik</a></li>
            <li><a href="#">Hobi</a></li>
            <li><a href="#">Rumah Tangga</a></li>
            <li><a href="#">Category 5</a></li>
            <li><a href="#">Category 6</a></li>
            <li><a href="#">Category 7</a></li>
            <li><a href="#">Category 8</a></li>
            <li><a href="#">Category 9</a></li>
            <li><a href="#">Category 10</a></li>
            <li><a href="#">Category 11</a></li>
            <li><a href="#">Category 12</a></li>
            <li class="last"><a href="#">Category 13</a></li>
            -->
            <c:forEach items="${kategoris}" var="kategori">
                <li><a href="#"><c:out value="${kategori.namakategori}" /></a></li>
            </c:forEach>
          </ul>
        </div>
      </div>
      <!-- End Categories -->
    </div>
    <!-- End Sidebar -->
    <div class="cl">&nbsp;</div>
  </div>
  <!-- End Main -->
  <!-- Side Full -->
  <div class="side-full">
    <!-- More Products -->
    <div class="more-products">
      <div class="more-products-holder">
        <ul>
          <li><a href="#"><img src="small1.jpg" alt="" /></a></li>
          <li><a href="#"><img src="small2.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small3.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small4.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small5.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small6.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small7.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small1.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small2.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small3.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small4.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small5.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small6.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small7.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small1.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small2.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small3.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small4.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small5.jpg" alt="" /></a></li>
          <li><a href="#"><img src="css/images/small6.jpg" alt="" /></a></li>
          <li class="last"><a href="#"><img src="css/images/small7.jpg" alt="" /></a></li>
        </ul>
      </div>
      <div class="more-nav"> <a href="#" class="prev">previous</a> <a href="#" class="next">next</a> </div>
    </div>
    <!-- End More Products -->
    <!-- Text Cols -->
    <div class="cols">
      <div class="cl">&nbsp;</div>
      <div class="col">
        <h3 class="ico ico1">Donec imperdiet</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec imperdiet, metus ac cursus auctor, arcu felis ornare dui.</p>
        <p class="more"><a href="#" class="bul">Lorem ipsum</a></p>
      </div>
      <div class="col">
        <h3 class="ico ico2">Donec imperdiet</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec imperdiet, metus ac cursus auctor, arcu felis ornare dui.</p>
        <p class="more"><a href="#" class="bul">Lorem ipsum</a></p>
      </div>
      <div class="col">
        <h3 class="ico ico3">Donec imperdiet</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec imperdiet, metus ac cursus auctor, arcu felis ornare dui.</p>
        <p class="more"><a href="#" class="bul">Lorem ipsum</a></p>
      </div>
      <div class="col col-last">
        <h3 class="ico ico4">Donec imperdiet</h3>
        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec imperdiet, metus ac cursus auctor, arcu felis ornare dui.</p>
        <p class="more"><a href="#" class="bul">Lorem ipsum</a></p>
      </div>
      <div class="cl">&nbsp;</div>
    </div>
    <!-- End Text Cols -->
  </div>
  <!-- End Side Full -->
  <!-- Footer -->
  <div id="footer">
    <p class="left"> <a href="#">Home</a> <span>|</span> <a href="#">Support</a> <span>|</span> <a href="#">My Account</a> <span>|</span> <a href="#">The Store</a> <span>|</span> <a href="#">Contact</a> </p>
    <p class="right"> &copy; 2010 Shop Around. Design by <a href="http://chocotemplates.com">Chocotemplates.com</a> </p>
  </div>
  <!-- End Footer -->
</div>
<!-- End Shell -->
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>
</html>

