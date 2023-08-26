var app = angular.module("myapp",[]);

app.controller("user-ctrl",function($scope,$http){
	$scope.items =[];
	$scope.form = {};
	$scope.initialize = function(){
		//load user
		$http.get("/rest/users").then(resp =>{
			$scope.items = resp.data;
			
		});
	}
	
	//Hiển thị lên form
	$scope.edit = function(item){
		$scope.form = angular.copy(item);
	}
	
	$scope.reset = function(){
		$scope.form = {
			
		}
	}
	
	$scope.create = function(){
		var item = angular.copy($scope.form);
		$http.post(`/rest/users`,item).then(resp =>{
			$scope.items.push(resp.data);
			$scope.reset();
			alert("Thêm mới thành công");
		}).catch(error =>{
			alert("Thêm mới thất bại!");
			console.log("Error: "+error);
		});
	}
	
	$scope.update = function(){
		var item = angular.copy($scope.form);
		$http.put(`/rest/users/${item.stt}`,item).then(resp =>{
			var index = $scope.items.findIndex(p => p.stt == item.stt);
			$scope.items[index] = item;
			alert("Cập nhật thành công!");
		}).catch(error =>{
			alert("Cập nhật thất bại!");
			console.log(error);
		});
	}
	
	$scope.delete = function(item){
		$http.delete(`/rest/users/${item.stt}`).then(resp=>{
			var index = $scope.items.findIndex(p =>p.stt == item.stt);
			$scope.items.splice(index,1);
			$scope.reset();
			alert("Xóa sản phẩm thành công!");
		}).catch(error =>{
			alert("Lỗi sản phẩm!");
			console.log(error);
		});
	}
	
	$scope.initialize();
	$scope.reset();
})