package com.pfv.udemytodolist.data.model

import androidx.compose.ui.graphics.Color
import com.pfv.udemytodolist.ui.theme.HighPriorityColor
import com.pfv.udemytodolist.ui.theme.LowPriorityColor
import com.pfv.udemytodolist.ui.theme.MediumPriorityColor
import com.pfv.udemytodolist.ui.theme.NonePriorityColor

enum class TaskPriority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}