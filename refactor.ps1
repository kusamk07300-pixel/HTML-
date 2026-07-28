# 1. Define Paths
$baseDir = "c:\Users\dell\Desktop\babycat_release_06101853_1.0.4_4.apk_Decompiler.com"
$sourceDir = "$baseDir\sources"
$resourcesDir = "$baseDiresources"
$targetDir = "$baseDir\ArvindParty_Clean"
$mainDir = "$targetDir\app\src\main"

# 2. Create Clean Project Structure
New-Item -ItemType Directory -Force -Path "$mainDir\java"
New-Item -ItemType Directory -Force -Path "$mainDires"
New-Item -ItemType Directory -Force -Path "$mainDir\assets"

# 3. Copy Core Business Logic
Copy-Item -Recurse -Force "$sourceDir
et" "$mainDir\java"
if (Test-Path "$mainDir\java
et\lucode") {
    Remove-Item -Recurse -Force "$mainDir\java
et\lucode"
}

# 4. Copy Gift Animation Player
# The path might need adjustment if qgame is not directly under com/tencent
if (Test-Path "$sourceDir\com	encent\qgame") {
    Copy-Item -Recurse -Force "$sourceDir\com	encent\qgame" "$mainDir\java\com	encent"
}

# 5. Copy Resources and Assets
Copy-Item -Recurse -Force "$resourcesDires\*" "$mainDires"
Copy-Item -Recurse -Force "$resourcesDir\assets\*" "$mainDir\assets"

# 6. Copy AndroidManifest.xml
Copy-Item "$resourcesDir\AndroidManifest.xml" "$mainDir\AndroidManifest.xml"

# 7. Clean Language-Specific Resources
Get-ChildItem -Path "$mainDires" -Directory values-* | Where-Object { $_.Name -match '^values-([a-z]{2}(-[rR][A-Z]{2})?)$' -and $_.Name -notmatch '^values-en' } | ForEach-Object { Remove-Item -Recurse -Force $_.FullName }

Write-Host "Extraction and refactoring complete. Clean project is at: $targetDir"
