
var arr=[1,2,3,4,5];

<!--1.找出元素 item 在给定数组 arr 中的位置 -->
function fun1(arr,item) {
    var i=arr.length;
    while (i--) {
        if (arr[i] === item) {
            return i;
        }
    }
    return -1;
}
<!-- 2.计算给定数组 arr 中所有元素的总和-->
function fun2(arr) {
    var sum=0;
    arr.forEach((i)=>
    {
        sum+=i;
    });
    return sum;
}

<!--3.移除数组 arr 中的所有值与 item 相等的元素。不要直接修改数组 arr，结果返回新的数组 -->
function fun3(arr,item) {
        var i=arr.length;
        var newArr=[];
        while (i--) {
            if (!(arr[i] === item)) {
               newArr.push(arr[i]);
            }
        }
        return newArr;
}

<!-- 4.移除数组 arr 中的所有值与 item 相等的元素，直接在给定的 arr 数组上进行操作，返回原有数组 -->
function fun4(arr,item) {
    newArr=[];
    newArr=arr.slice(item)
    return newArr;
}
<!--5.在数组 arr 末尾添加元素 item，返回数组 -->
function fun5(arr,item) {
    arr.push(item);
    return arr;
}
<!--6.删除数组 arr 最后一个元素，返回数组 -->
function fun6(arr) {
    arr.pop();
    return arr;
}
<!--7.在数组 arr 开头添加元素 item，返回数组 -->
function fun7(arr,item) {
    arr.unshift(item);
    return arr;
}
<!--8.删除数组 arr 第一个元素，返回数组 -->
function fun8() {
    arr.splice(0,1);
    return arr;
}

<!--9.合并数组 arr1 和数组 arr2，返回合并后的数组-->
function fun9(arr,arr1) {
    var newArr=[];
    newArr =  arr.concat(arr1);
    return newArr;
}

<!--10.在数组 arr 的 index 处添加元素 item，返回数组-->
function fun10(arr,index,item) {
  arr.splice(index,0,item);
  return arr;
}
<!--11.统计数组 arr 中值等于 item 的元素出现的次数，返回次数 -->
function fun11(arr,item) {
    var len=arr.length;
    var c=0;
    while (len--){
        if(arr[len] ===item ){
            c++;
        }
    }
    return c;
}
<!--12.找出数组 arr 中重复出现过的元素，返回重复元素的数组 -->
function fun12(arr) {
    newArr=[];
   for (var i=0;i<arr.length;i++){
       let flag=false;
        for (var j=0;j<newArr.length;j++){
            if(arr[i] == newArr[j]){
                flag=true;
                break;
            }
        }
        if(!flag){
            newArr.push(arr[i]);
        }
   }
   return newArr;
}

<!--13.数组 arr 中的每个元素求二次方，返回数组 -->
function fun13() {
    var newArr=[];
    arr.forEach(i=>{
        var j=i*i;
        newArr.push(j);
    })
    return newArr;
}

<!--14.在数组 arr 中，查找值与 target 相等的元素出现的所有位置，返回一个下标数组-->
function fun14(arr,target) {
    var i=arr.length;
    var newArr=[];
    while (i--) {
        if (arr[i] === target) {
            newArr.push(i);
        }
    }
    return newArr;
}






