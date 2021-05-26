var menuList = document.getElementById("menuList");

menuList.style.maxHeight = "0px";

function togglemenu(){
	if (menuList.style.maxHeight == "0px") {

		menuList.style.maxHeight = "160px";
	}else
	{
		menuList.style.maxHeight = "0px";
	}
}
 document.getElementById("mybtn").onclick = function () {
        location.href = "addcart.html";
    };