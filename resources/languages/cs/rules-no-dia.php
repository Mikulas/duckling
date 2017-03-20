<?php

require __DIR__ . '/vendor/autoload.php';
use Nette\Utils\Finder;
use Nette\Utils\Strings;

foreach (Finder::findFiles('*.clj')->from(__DIR__ . '/rules') as $path => $_) {
	$raw = file_get_contents($path);

	$content = preg_replace_callback('~\p{L}~u', function($match) {
		$char = $match[0];
		$fold = Strings::toAscii($char);
		if ($char === $fold) {
			// no change
			return $char;
		}
		return "[{$char}{$fold}]";
	}, $raw);

	file_put_contents($path, $content);
}
