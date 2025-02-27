/*
 * SPDX-FileCopyrightText: 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.aperture.camera

import androidx.camera.core.CameraInfo
import androidx.camera.core.CameraSelector

/**
 * A logical camera's backing physical camera.
 */
class PhysicalCamera(
    cameraInfo: CameraInfo
) : BaseCamera(cameraInfo) {
    override val cameraSelector: CameraSelector = CameraSelector.Builder()
        .setPhysicalCameraId(cameraId)
        .build()
}
