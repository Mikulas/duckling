<?php

require __DIR__ . '/vendor/autoload.php';
use Nette\Utils\Finder;
use Nette\Utils\Strings;

foreach (Finder::findFiles('*.no-dia.clj')->from(__DIR__ . '/corpus') as $info) {
	unlink($info->getPathname());
}

foreach (Finder::findFiles('*.clj')->from(__DIR__ . '/corpus') as $info) {
	$raw = file_get_contents($info->getPathname());

	$new = $info->getPath() . '/' . $info->getBasename($info->getExtension()) . 'no-dia.clj';
	file_put_contents($new, Strings::toAscii($raw));
}
