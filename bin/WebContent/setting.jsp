<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>登録/変更</title>
    </head>
    <body>
    <h3>新規端末登録</h3>
    <form action = "/device_management_system/SetDeviceNameServlet" method="get">
    <label for = "new">端末名</label>
    <input type = "text" id = "new" name = "device_name">
    <input type = "submit" value = "登録" >
    </form>
    </body>
    </body>
</html>