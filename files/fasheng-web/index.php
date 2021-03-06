<?php

// change the following paths if necessary
$rootDir = dirname(__FILE__);
define( 'ROOT_DIR' , $rootDir );
define( 'CONFIG_DIR', ROOT_DIR.'/protected/config' );
define( 'PROTECTED_DIR', ROOT_DIR.'/protected' );

$yii = ROOT_DIR.'/../yii/framework/yii.php';
$globalFunction = PROTECTED_DIR.'/GlobalFunction.php';
$config = CONFIG_DIR.'/main.php';

// remove the following lines when in production mode
defined('YII_DEBUG') or define('YII_DEBUG',true);
// specify how many levels of call stack should be shown in each log message
defined('YII_TRACE_LEVEL') or define('YII_TRACE_LEVEL',3);

require_once($yii);
require_once($globalFunction);
Yii::createWebApplication($config)->run();
