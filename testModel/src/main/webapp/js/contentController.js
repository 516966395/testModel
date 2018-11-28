app.controller("contentController", function($scope, $http){

    $scope.saveContent = function(){

        $http.post("content/save.do", $scope.entity).success(

            function(response){

                alert(response);
                $scope.searchList();
            }
        )
    }

    $scope.searchList = function(){

        $http.get("content.do").success(

            function(response){

                $scope.list = response;
            }
        )
    }

    $scope.showContent = function(id){

        $http.get("content/findOne.do?id=" + id).success(

            function(response){

                $scope.entity = response;
            }
        )
    }

    $scope.deleteContent = function(id){

        $http.get("content/delete.do?id=" + id).success(

            function(response){

                $scope.searchList();
            }
        )
    }

})