<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Count the smiley faces!</title>
</head>
<style>
    div.stepOne {
        background: rgba(0, 0, 0, 1);
        color: white;
    }
    div.stepOne span {
        opacity: 1;
    }
</style>
<body>

<?php

echo "<strong>Count the smiley faces!</strong>";
echo "<br>";

function count_smileys($arr): int {
    print_r($arr);
    echo '<br>';
    $valid = array(':D',':~)',';~D',':)',';-D');
    $count = 0;
    foreach ($arr as $value){
        echo 'aqui';
        echo '<br>';
        if(in_array($value, $valid)){
            echo $value;
            echo '<br>';
            $count++;
        }
    }
    return $count;
}

echo count_smileys([';]', ':[', ';*', ':$', ';-D']);

echo "<br>";
echo "<br>";

?>
</div>
</div>

</body>
</html>
