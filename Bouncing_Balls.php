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

function bouncingBall($h, $bounce, $window) {
    // your code
    $count = -1;
    if($h>$window && $bounce>0.0 && $bounce<1.0 && $h>0.0){
        $h = $h*$bounce;
        $count = 1;
        while ($h>$window){
            $h = $h*$bounce;
            $count = $count +2;
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
