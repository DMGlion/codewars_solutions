<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Rotate for a Max</title>
</head>

<body>

<?php

echo "<strong>Rotate for a Max</strong>";
echo "<br>";

function maxRot($n) {
    $valueParse ="";
    $endArray = array();
    array_push($endArray,$n);
    $sizeInit = count(str_split($n))-1;
    for ($i = 0; $i<$sizeInit;$i++ ){
        if ($i==0){
            $separated = str_split($n);
            $single = $separated[0];
            array_shift($separated);
            array_push($separated, $single);
            $valueParse = implode('', $separated);
            array_push($endArray,$valueParse);

        }else{
            $start = substr($valueParse, 0,$i);
            $end = substr($valueParse,$i,(strlen($valueParse)));
            $separated = str_split($end);
            $single = $separated[0];
            array_shift($separated);
            array_push($separated, $single);
            array_unshift($separated, $start);
            $valueParse = "";
            $valueParse = implode('', $separated);
            array_push($endArray,$valueParse);

        }
    }
    return max($endArray);
}

echo count_smileys([';]', ':[', ';*', ':$', ';-D']);

echo "<br>";
echo "<br>";

?>
</div>
</div>

</body>
</html>
